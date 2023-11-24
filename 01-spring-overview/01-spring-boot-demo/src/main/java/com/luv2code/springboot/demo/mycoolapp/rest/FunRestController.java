package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FunRestController {

    @GetMapping("/greet")
    public String greeetins(){
        return "Ushhh! very sleepy";
    }
}
