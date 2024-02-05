package com.example.demobootmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") Person person){
        return "hello " + person.getName();
    }
    @GetMapping("/hello")
    public String helloV2(@RequestParam("name") Person person){
        return "hello " + person.getName();
    }
}
