package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import package br.com.SpringApp.SpringApp;
import package br.com.SpringApp.SpringApp.controller;
import package br.com.SpringApp.SpringApp.model;


@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }
}
