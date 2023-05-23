package com.politikos.moduleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/module")
public class ModuleController {

    @GetMapping("/all")
    public String getStatus(){
        return "200";
    }
}
