logLevel := Level.Warn

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.2.0")

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.7.9")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.4.0")

resolvers += Resolver.sonatypeRepo("releases")
