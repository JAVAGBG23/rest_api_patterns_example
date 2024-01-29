package com.restApi.patterns.controller;

import com.restApi.patterns.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
    @GetMapping("/person")
    public String personForm(Model model) {
        model.addAttribute("person", new Person());
        return "personform";
    }

    @GetMapping("/personResult")
    public String personSubmit(@RequestParam String name, @RequestParam int age, Model model) {
        Person person = new Person(name, age);
        model.addAttribute("person", person);
        return "personresult";
    }
}
