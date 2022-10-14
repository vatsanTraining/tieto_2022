1) Create a spring boot starter Project with web,lombok,datajpa and mysql or oracle driver
2) Create a java class add the annotations (@Entity,@Table,@Id and @Column)
3) Create a Interface extending JPARepository
4) Create a Service Class and Autowire Repository
5) Call the Method of the repository in the service class methods
6) Register the Entity Bean with Values 
7) Access Entity Bean and Service bean using getBean Method
8) Pass entity Bean to the save Method of the service and print the return value
9) Update the application.properties file and Run the Main method , observe the results
10) Repeat by Calling other methods of the Service class
===========================================================

Packaging the Application

1) Update the pom.xml file 
2) Add element finalName to build Section
3) Invoke the maven goal package , skip tests
4) Check the Target Folder for the jar file
5) Exit from STS 
6) Navigate to the Target Folder 
7) Invoke java -jar jarFileName

=====================================


Expose the application as REST Service

1) Add a Rest Controller 
2) ADD all the CRUD methods 
3) Additional add a method to find the Products whose ratePerUnit is more than Rs.200
   Use @Query with JPQL
   
   
