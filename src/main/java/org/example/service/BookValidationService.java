package org.example.service;

import org.example.domain.Book;

public class BookValidationService {

    public void bookValidation(Book book, boolean important) {

        //control of object creation and maintaince : service

        IValidator validator;

        validator=new TitleValidator();
        validator.validate(book);

        if(important){
            validator=new SpellValidator2();

        }else {
            validator = new SpellValidator();
        }
        validator.validate(book);

        validator=new IndexValidator();
        validator.validate(book);

        // store to the database.

    }


    public void bookValidationWithDI(Book book, IValidator... validators) {

        ///control of object creation : Driver/caller/client
        for(IValidator v:validators){
            v.validate(book);
        }//code to store the book to the databases
    }
}


/***
 * Spring framework
 *
 * Started with 2002 and got widely accepted in the industry.
 *
 * Different dedicated frameworks of Spring
 *
 * Spring Boot:
 * Initially released in 2014, Spring Boot simplifies the process of creating stand-alone, production-grade Spring-based applications.
 *
 * Spring Data:
 * First released in 2010, Spring Data provides a consistent, high-level approach to working with data access technologies, including relational and NoSQL databases, map-reduce frameworks, and cloud-based data services.
 *
 * Spring Security:
 * Spring Security, initially released in 2003 as Acegi Security, provides comprehensive security services for Java EE-based enterprise software applications.
 *
 * Spring Batch:
 *Released in 2007, Spring Batch provides reusable functions to process large volumes of data, including reading, writing, and processing data in batches.
 *
 * Spring Cloud:
 * Introduced in 2015, Spring Cloud provides tools for building distributed systems and microservices-based applications, including service discovery, configuration management, circuit breakers, etc.
 *
 *
 *  DI - Dependency Injection -> Spring will inject the dependency (provide the object to the respective service when asked)
 *  IOC - Inversion of Control -> Spring will be responsible for creating and maintaining the Objects called spring beans
 *
 *
 *  which states, Spring will be responsible for creating an object for me and maintaining it through the lifecycle.  - IOC
 *  As a service, it is spring's job to provide (Injection)  the required objects ( Dependency)  to me. - Dependency Injection
 *
 * BookValidationService  has dependency on IValidator.
 * in method 1, the service itself is in control of creating an object and does not need any dependency injected
 *
 * in method 2, the service needs a dependency injected, while the control of the object creation is in the driver.
 *
 * Objects which are created and maintained by Spring are called Beans.
 *
 *
 * Benefits of Dependency Injection (DI):
 *
 * Decoupling
 * Flexibility
 * Reusability
 * Testability
 * Scalability
 *
 * Benefits of Inversion of Control (IoC):
 *
 * Encapsulation
 * Promotes Separation of Concerns:
 * Flexibility
 * Reusability
 * Decoupling
 *
 *
 *
 * */
