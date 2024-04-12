package org.example.service;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonExampleService {

    public static void main(String[] args) throws SQLException {



        Connection c1=DBService.getMySqlConnection();

        System.out.println(c1.hashCode());

        Connection c4=DBService.getMySqlConnection();

        System.out.println(c4.hashCode());

        Connection c5=DBService.getMySqlConnection();

        System.out.println(c5.hashCode());




        Connection c2=DBService.getMySqlConnection();

        System.out.println(c2.hashCode());


        Connection c3=DBService.getMySqlConnection();

        System.out.println(c3.hashCode());


    }


    /***
     *1. created new object inside the getMySqlConnection() method.
     * 366803687
     * 509832867
     * 1936502650
     * 1232373427
     * 1979274004
     *
     *
     * */
}
