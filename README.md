Getting Started with Squbs
--------------------------

1. Run the following alone sbt comand on the console window to enter the interactive mode.

2. Start the glassfish server using the start comand.

3. Run the jacoco by jacoco:cover for Java, but with quirks.

5. Open the following URL in your browser
   * http://localhost:8000/farm: Simple farm response
   * http://localhost:8000/farm/{get}: Hello response farm name and return Json response
   * http://localhost:8000/farm/{name}/{there}: Sends chunked response in intervals with delay in seconds

6. Enter the in console URL: http://localhost:8080/farm

7. run docker to create an iso.

8. docker run -p 9000:8000 <farmhands>` to run as a docker image.
