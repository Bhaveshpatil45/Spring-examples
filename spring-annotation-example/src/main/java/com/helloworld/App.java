package com.helloworld;

import com.helloworld.model.Address;
import com.helloworld.model.City;
import com.helloworld.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.setName("Pankaj");
        helloService.setAddress(new Address(City.builder().name("Mumbai").build()));

        helloService.sayHello();
    }
}
