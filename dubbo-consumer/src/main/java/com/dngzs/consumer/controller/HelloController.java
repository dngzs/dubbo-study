package com.dngzs.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    public com.dngzs.producer.service.HelloService helloService;

    @GetMapping("/")
    public String hello(){
        return helloService.hello();
    }
}
