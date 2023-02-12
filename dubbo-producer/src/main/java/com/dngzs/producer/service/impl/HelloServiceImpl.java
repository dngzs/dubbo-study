package com.dngzs.producer.service.impl;

import com.dngzs.producer.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello 张博";
    }
}
