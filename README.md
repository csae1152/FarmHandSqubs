Getting Started with Squbs
--------------------------

1. Run sbt from root directory to enter the interactive mode.

2. Start the server by using `start`.

3. Run jacoco by jacoco:cover for Java, but with quirks.

5. URLs:
   * http://localhost:8080/farm: Simple hello response
   * http://localhost:8080/farm/{some_name}: Hello response greeting name and return Json response
   * http://localhost:8080/farm/{some_name}/{delay}: Sends chunked response in intervals with delay in seconds

6. Console URL: http://localhost:8080/adm

7. docker to create a docker image.

8. docker run -p 8080:8000 <FARM>` to run as a docker container.
