package com.helloworld.repository;

import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;

@Repository
public class HelloRepository {
    public void sayHello(String name, String city){
        //db logic
        System.out.println("Hello " + name +  "from" + city + "!!!");
    }
}
