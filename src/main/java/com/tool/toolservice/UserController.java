package com.tool.toolservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getHelloUser() {
        return "Hello users";
    }
}
