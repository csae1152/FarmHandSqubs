Lets start with squbs
---------------------

1. Running the following standalone sbt comand in the console window to enter the interactive mode.

2. Start glassfish server at local port using the start comand.

3. Run the jacoco by jacoco:cover within Java, but with quirk.

5. Open the following URL in your browser
   * http://localhost:8000/farm: Simple farm response
   * http://localhost:8000/farm/{get}: Hello response farm name and return Json response
   * http://localhost:8000/farm/{name}/{there}: Sends chunked response in intervals with delay in seconds

6. Enter the following command into the console URL: http://localhost:8000/farm

7. run docker to create an iso image.

8. docker run -p 9000:8000 <farmhands>` to run as a docker image.
