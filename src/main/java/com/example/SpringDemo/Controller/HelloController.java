package com.example.SpringDemo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public List<String> Hello(){
        return Arrays.asList("serverserver", "viewview");
    }
}
