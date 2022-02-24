# javaproject

This is java project for employees of the university, this project contains several classes to work with. In this read me file we will try to go through all the main components of the project.

First of all, we have created the exceptions and dao packages, these packages were created to work with db, we have used Mysql db. 
Class called exceptions, uses polymorphism and the try-catch statements, because when creating CRUD app, the objects could lead to the problem, and by this statemnet we can solve the problem right away
Also, we have used interface and abstract classes, to achieve total abstraction.
Then dao class means data-access-object it means, to work with db, we need to call sql prepared statements, by console, so somehow we need to access them. Therefore it was created. 

Second of all, we created the essential class called services, it connects the main classes with db, so for example if we want to change the db from sql to oracle or for example change the driver, then all we need to do is to change this class only, so the changes would accure everywhere. It uses polymorhism and encapsulation. 

Third of all, we created the business package, which contains several classes which are connected by inheritance (parent and child, parent is Salary calc, then two classes for first and second employee are child) the formula for finding the salary might be wrong, but it can be changed easily.
Then the employee class, which calls the sql statements. Also inharitance. also it contains the encapsulation. 

Done by Abay and Elnar, CS2101
