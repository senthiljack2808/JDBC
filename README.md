# JDBC

* Load the driver class using class.forname()
* Establish a connection
* create statement
* Execute Query
* close connection


In a real world imagine

* Making a phone call
* First it will establish a connection to your friend
* initiate a conversation
* speak for hrs
* cut/end the call


## Statements

* PreparedStatement

* Statement

* CallableStatement


PreparedStatement :

Used to avoid sql injection attacks from hackers.



CallableStatement:

Used for calling stored procedure from db.

SQL Injection (SQLi) is a type of an injection attack that makes it possible to execute malicious SQL statements. These statements control a database server behind a web application. Attackers can use SQL Injection vulnerabilities to bypass application security measures.
