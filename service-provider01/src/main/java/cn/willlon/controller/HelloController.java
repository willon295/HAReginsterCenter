package cn.willlon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/get")
    public String hello( String name) {
        return "Hello.." + name;
    }
}
