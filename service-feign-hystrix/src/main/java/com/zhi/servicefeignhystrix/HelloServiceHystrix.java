package com.zhi.servicefeignhystrix;

import org.springframework.stereotype.Component;

/**
 * 熔断时触发
 */
@Component
public class HelloServiceHystrix implements HelloService {

    public HelloServiceHystrix() {
        System.out.println("HelloServiceHystrix");
    }

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, " + name;
    }
}
