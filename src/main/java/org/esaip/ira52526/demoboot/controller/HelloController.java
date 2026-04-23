package org.esaip.ira52526.demoboot.controller;

import org.esaip.ira52526.demoboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String greeting(@RequestParam("n") String name) {
        return service.greeting(name);
    }
}
