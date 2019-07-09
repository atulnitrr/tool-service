package com.tool.toolservice.controller;

import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tool.toolservice.model.request.UserRequest;
import com.tool.toolservice.model.response.UserResponse;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getHelloUser() {
        return "Hello users";
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody final UserRequest userRequest) {
        final UserResponse userResponse = new UserResponse();
        userResponse.setUserId("1111");
        System.out.println(userRequest.toString());
        return ResponseEntity.ok().body(userResponse);

    }
}
