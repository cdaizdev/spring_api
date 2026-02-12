package com.api.spring_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring_api.model.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @GetMapping("/")
    public List<User> index() {
        return List.of(new User(1L, "Carlos"), new User(2L, "Ana"));
    }

    @PostMapping("/create-user")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
    
    public User create(@RequestBody User usuario) {
        return usuario;
    }
}
