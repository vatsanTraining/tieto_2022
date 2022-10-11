1) Create a Maven Project with archetype jersey-quickstart
2) Once the Project is created uncomment "json-binding" depedency
3) Create a Java Class to be mapped to a row of a table 
4) Add mysqldriver as dependency in pom.xml
5) Create a Resource Folder inside src folder
6) Add a properties file application.properties
7) Add the Database Connection details in the application.properties
8) Create a ConnectionFactory class and connect to database
9) Create a Repository Interface with CRUD method
10) Implement the Methods of the interface
11) Create a Service class and invoke repository methods ,handle exceptions
12) Create a Resource class annotate it with @PATH,@GET and other such annotations
13) Create a Table in the Rdbms with columns matching the java class
14) Run the Application
15) Test it with POSTMan
==============================================

-> Client Side -> Presentation => fees.html(java script section)-> 
-> Java Middle Tier ->java->FeeResource -> FeeService->FeeRepository->
-> Data tier ->RDBMS->MySql->tieto_fee