package com.helloworld.service;


import com.helloworld.model.Address;
import com.helloworld.repository.HelloRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    private String name;
    private Address address;

    public void sayHello(){
        helloRepository.sayHello(name,address.getCity().getName());
    }
}
