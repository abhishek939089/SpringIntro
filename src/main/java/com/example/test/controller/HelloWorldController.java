package com.example.test.controller;

import org.springframework.web.bind.annotation.*;
import com.example.test.dto.UserDTO;

@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name){
        return "Hello " + name+" from Bridgelabz";
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }

    @PutMapping("/put/{firstName}")
    public String updateGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
