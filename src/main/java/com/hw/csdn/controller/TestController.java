package com.hw.csdn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    public String helloWord(){

        return "Hello SpringBoot";
    }
}
