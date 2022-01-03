package com.webbear.buisnes_calc.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class AuthUser {
    @GetMapping("")
    public ResponseEntity loginPerson(){
        try {
            return ResponseEntity.ok("worked");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("ex: ");
        }
    }
}