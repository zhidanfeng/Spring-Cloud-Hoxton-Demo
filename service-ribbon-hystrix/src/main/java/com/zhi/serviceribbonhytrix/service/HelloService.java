package com.zhi.serviceribbonhytrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 当服务提供方掉线，不能提供服务时触发fallbackMethod
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EURKA-CLIENT/hi?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hi," + name + ", sorry, error!";
    }
}
