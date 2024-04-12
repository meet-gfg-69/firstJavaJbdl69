package org.example.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Objects;

public class DBService {

    static Connection  mySqlConnection;

    private DBService() throws SQLException {
    }


    public static Connection getMySqlConnection() {

        if(Objects.isNull(mySqlConnection)){
            try {
                mySqlConnection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ewallet52", "root", "root");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return mySqlConnection;
    }



   /****
    * There would be developers.
    * They will compile the code.
    * test the code
    *
    * They create a jar of the final code.
    *
    * test the jar
    *
    * upload it the repository
    *
    *
    *
    *
    * */

   /**
    * Tools for managing the lifecycle of project
    *
    * 1. Maven
    * 2. Ant
    * 3. Gradle
    *
    *
    * Company GFG
    * 1. Logging
    * 2. Queue
    *
    * <groupID>com.gfg</groupID>
    * <artifact>gfglogger</artifact>
    * <version>1.0</version>
    *
    * <groupID>com.gfg</groupID>
    * <artifact>gfgqueue</artifact>
    * <version>2.0</version>
    *
    *
    *
    *
    * */



}



/*
J2ee
annotations
ORM support - hibernate
Integration with server
JMS - java message service
JDBC - Java Database Connectivity
JPA - Java Persistence API
JAX-RS - Java API for RESTful web services
JSP - java servelet pages


Spring framework

Lightweight Jar
XML configurations for beans
 IOC and DI - Inversion of control and Dependency Injection
AOP - Annotation based programming
AOP - Aspect Oriented Programming
Build support - for Maven, gradle, ant..


Springboot framework



* */
