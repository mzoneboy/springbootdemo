package com.discover.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
public class App 
{
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello,Jay!";
    }
    
    @RequestMapping("/hi/{name}")
    @ResponseBody
    String home(@PathVariable String name) {
        return "hello,"+name;
    }
    
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
