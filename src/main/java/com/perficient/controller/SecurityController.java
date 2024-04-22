package com.perficient.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class SecurityController {

    @GetMapping("/getControllerName")
    public String getControllerName() {
        return "SecurityController";
    }

    @GetMapping("/validateUser")
    @PreAuthorize("hasRole('USER')")
    public String validateUser() {
        return "I have User role";
    }
    @GetMapping("/validateUserAdmin")
    @PostAuthorize("hasRole('ADMIN')")
    public String validateUserAdmin() {
        return "I have Admin role";
    }

    @GetMapping("/")
    public String homeController() {
        return "Home";
    }
}
