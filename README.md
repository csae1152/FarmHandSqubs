Getting Started with Squbs
--------------------------

1. Run sbt comand from console to enter the interactive mode.

2. Start the server by using start.

3. Run jacoco by jacoco:cover for Java, but with quirks.

5. Open the URL
   * http://localhost:8000/farm: Simple farm response
   * http://localhost:8000/farm/{get}: Hello response greeting name and return Json response
   * http://localhost:8000/farm/{name}/{here}: Sends chunked response in intervals with delay in seconds

6. Enter console local URL: http://localhost:8080/farm

7. docker to create an image.

8. docker run -p 8080:8000 <farm>` to run as a docker image.
