package org.example.firstspringboot.controller;

import org.example.firstspringboot.model.Student;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping
    public String printValue(@RequestBody Student value) {
        return "Hello " + value.firstName() + " " + value.lastName();
    }

    @GetMapping("/{id}")
    public String printValue(@PathVariable String id) {
        return "Hello your ID is: " + id;
    }

    @GetMapping("/search")
    public String printquery(@RequestParam String q) {
        return "Your query is: " + q;
    }


    // Methode zum Begrüßen mit Namen
    @GetMapping("/name/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hallo, " + name + "!";
    }
}
