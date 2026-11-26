
package com.collaborativeworkspace.workspace.platform.controller;

import com.collaborativeworkspace.workspace.platform.dto.UserRequest;
import com.collaborativeworkspace.workspace.platform.dto.UserResponse;
import com.collaborativeworkspace.workspace.platform.entity.User;
import com.collaborativeworkspace.workspace.platform.service.UserService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> registerUser(
            @Valid @RequestBody UserRequest request) {

        User user = new User(
            request.name(),
            request.email(),
            request.password()
        );

        User savedUser = userService.registerUser(user);

        UserResponse response = new UserResponse(
            savedUser.getId(),
            savedUser.getName(),
            savedUser.getEmail()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        List<UserResponse> users = userService.getAllUsers()
            .stream()
            .map(user -> new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail()
            ))
            .toList();

        return ResponseEntity.ok(users);
    }
}
