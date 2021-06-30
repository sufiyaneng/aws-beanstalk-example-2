package com.techprimers.aws;
package br.com.SpringApp.SpringApp;
package br.com.SpringApp.SpringApp.controller;
package br.com.SpringApp.SpringApp.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 


@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }
}
