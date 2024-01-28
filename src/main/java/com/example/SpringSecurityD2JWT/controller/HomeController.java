package com.example.SpringSecurityD2JWT.controller;

import com.example.SpringSecurityD2JWT.model.OurUser;
import com.example.SpringSecurityD2JWT.service.OurUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    OurUserService ourUserService;

    @GetMapping("/user")
    public List<OurUser> getUser(){
        return this.ourUserService.getOurUserList();
    }

    @GetMapping("/current-user")
    public String getLoggedInUserEmail(Principal principal){
        return principal.getName();
    }

}
