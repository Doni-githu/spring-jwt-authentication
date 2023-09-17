package com.spring.jwt.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
    
    @GetMapping("/unsecured") 
    public String unsecuredData(){
        return "Unsecured Data";
    } 
    
    @GetMapping("/secured") 
    public String securedData(){
        return "Secured Data";
    } 


    @GetMapping("/admin") 
    public String adminData(){
        return "Admin Data";
    } 


    @GetMapping("/info") 
    public String userData(Principal principal){
        return principal.getName();
    } 




    
}
