package com.ricardo.addingfolderstothymeleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //Method that will be called when the end point is accessed
    @GetMapping("/hello-world-js-css")
    public String helloWorld(Model model) { // Model model are the keywords that will send this to the viewer
        model.addAttribute("message", "'Hello, World'"); // This will add data to the model

        return "hello-world-js-css"; // This "helloworld" is the name of the html file  (helloworld.html)
    }

    //This code will return the code with JS and CSS changes
    @GetMapping("/style")
    public String style() { // Model model are the keywords that will send this to the viewer
        return "hello-world-js-css";
    }
}
