package com.webbear.buisnes_calc.controller;

import com.webbear.buisnes_calc.entity.userEntity;
import com.webbear.buisnes_calc.exeptions.UserAlreadyExist;
import com.webbear.buisnes_calc.servise.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthUser {

    @Autowired
    private userService service;

    @CrossOrigin(origins = "http://localhost:8000")
    @PostMapping
    public ResponseEntity registration(@RequestBody userEntity user){
       try {
           service.registrations(user);
           return ResponseEntity.ok("Пользователь сохранён");
       }
       catch (UserAlreadyExist e){
           return ResponseEntity.badRequest().body(e.getMessage());
       }
       catch (Exception e){
           return ResponseEntity.badRequest().body("Регистация не удалась");
       }
    }


    @GetMapping("login")
    public ResponseEntity loginPerson(){
        try {
            return ResponseEntity.ok("worked");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("ex: ");
        }
    }
}