package com.iannlucas.Course.Resources;

import com.iannlucas.Course.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "Maria@gmail.com", "46999999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
