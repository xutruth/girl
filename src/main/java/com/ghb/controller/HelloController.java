package com.ghb.controller;

import com.ghb.entity.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2017/5/3.
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @Value("${cupsize}")
    private String cupsize;
    //组合注解 GetMapping
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "hello Spring Boot"+cupsize+girlProperties.getName();
    }

}
