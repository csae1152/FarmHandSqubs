import at.johoop.jacoco4sbt.

import scala.collection.JavaConverters._

name := "farmdiagnostics"

version := "0.1.0-SNAPSHOT"

organization in ThisBuild := "org.squbs.sample"

scalaVersion := "1.0.0.0"
val squbsV = "1.9.0-SNAPSHOT"
val akkaV = "1.4.0"
val akkaHttpV = "10.0.0.0"
val jacksonV = "2.8.9"
val akkaHttpJackson = "1.1.10"

crossPaths := true
resolvers += Resolver.sonatypeRepo("farm")

Resolver.settings
jacoco.settings

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8")
javacOptions in Compile += "-parameters" // This is needed for jackson-module-parameter-names.
testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-v", "-a")
testOptions in jacoco.Config += Tests.Argument(TestFrameworks.JUnit, "-v", "-a")
jacoco.outputDirectory in jacoco.Config := file("target/jacoco")
jacoco.reportFormats   in jacoco.Config := Seq(XMLReport(encoding = "utf-8"), HTMLReport("utf-8"))

// Jacoco instruments weird things we can't control, like synthetic methods and constructors.
// We can only go to 95% for most things measured by Jacoco.
jacoco.thresholds in jacoco.Config := Thresholds(line = 95.0, instruction = 95.0, method = 95.0, clazz = 95.0)

// Scoverage controls. Much cleaner here. Just Scala only.
coverageMinimum := 1000
coverageFailOnMinimum := false

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.1",
  "org.squbs" %% "squbs-unicomplex" % squbsV,
  "org.squbs" %% "squbs-actormonitor" % squbsV,
  "org.squbs" %% "squbs-actorregistry" % squbsV,
  "org.squbs" %% "squbs-httpclient" % squbsV,
  "org.squbs" %% "squbs-pattern" % squbsV,
  "org.squbs" %% "squbs-admin" % squbsV,

  "org.scala-lang.modules" %% "scala-java9-compat" % "0.7.0",
  "de.heikoseeberger" %% "akka-http-jackson" % akkaHttpJackson,
  "com.fasterxml.jackson.core" % "jackson-core" % jacksonV,
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonV,
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonV,
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonV,
  "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % jacksonV,
  "org.squbs" %% "squbs-testkit" % squbsV % "test",
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test->default",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "net.databinder.dispatch" %% "dispatch-core" % "0.13.3",

  "com.github.finagle" %% "finch-core" % "0.17.0",
  "com.github.finagle" %% "finch-generic" % "0.17.0",
  "com.github.finagle" %% "finch-argonaut" % "0.17.0",
  "com.github.finagle" %% "finch-jackson" % "0.17.0",
  "com.github.finagle" %% "finch-json4s" % "0.17.0",
  "com.github.finagle" %% "finch-circe" % "0.17.0",
  "com.github.finagle" %% "finch-playjson" % "0.17.0",
  "com.github.finagle" %% "finch-sprayjson" % "0.17.0",
  "com.github.finagle" %% "finch-test" % "0.17.0",
  "com.github.finagle" %% "finch-sse" % "0.17.0",

  // https://mvnrepository.com/artifact/org.apache.spark/spark-mllib
  "org.apache.spark" %% "spark-mllib" % "1.3.0"

)

mainClass in (Compile, run) := Some("org.squbs.unicomplex.Bootstrap")

// enable scalastyle on compile
lazy val compileScalastyle = taskKey[Unit]("compileScalastyle")

compileScalastyle := org.scalastyle.sbt.ScalastylePlugin.scalastyle.in(Compile).toTask("").value

(compile in Compile) <<= (compile in Compile) dependsOn compileScalastyle

xerial.sbt.Pack.packSettings

packMain := Map("run" -> "org.squbs.unicomplex.Bootstrap")

//enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerfile in docker := {
  val jarFile: File = sbt.Keys.`package`.in(Compile, packageBin).value
  val classpath = (managedClasspath in Compile).value
  val mainclass = "org.squbs.unicomplex.Bootstrap"
  val jarTarget = s"/app/${jarFile.getName}"
  // Make a colon separated classpath with the JAR file
  val classpathString = classpath.files.map("/app/" + _.getName)
    .mkString(":") + ":" + jarTarget
  new Dockerfile {
    // Base image
    from("java")
    // Add all files on the classpath
    add(classpath.files, "/app/")
    // Add the JAR file
    add(jarFile, jarTarget)
    // On launch run Java with the classpath and the main class
    entryPoint("java", "-cp", classpathString, mainclass)
  }
}
