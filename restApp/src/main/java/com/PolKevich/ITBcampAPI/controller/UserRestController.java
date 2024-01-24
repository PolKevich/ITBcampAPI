package com.PolKevich.ITBcampAPI.controller;

import com.PolKevich.ITBcampAPI.model.User;
import com.PolKevich.ITBcampAPI.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping(UserRestController.USER_REST_URL)
public class UserRestController {

    public static final String USER_REST_URL = "users";

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Object> getAllUsers(@RequestParam(defaultValue = "0") int page) {

        Page<User> users = userService.findAll(page);

        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@Valid @RequestBody User user) {

        userService.create(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
