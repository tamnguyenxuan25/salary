package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @RequestMapping("/")
    public String index() {
        return "This is list employee page";
    }
    
    @RequestMapping("/add")
    public String add() {
        return "This is add employee page";
    }
    
    @RequestMapping("/delete")
    public String delete() {
        return "This is delete employee page";
    }
}
