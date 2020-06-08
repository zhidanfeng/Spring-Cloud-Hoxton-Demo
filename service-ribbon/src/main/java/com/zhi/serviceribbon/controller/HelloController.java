package com.zhi.serviceribbon.controller;

import com.zhi.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @CrossOrigin(origins="*", maxAge=3600)
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
