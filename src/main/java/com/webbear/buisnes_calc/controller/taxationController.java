package com.webbear.buisnes_calc.controller;

import com.webbear.buisnes_calc.entity.calculatedTaxation;
import com.webbear.buisnes_calc.servise.taxationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taxation")
public class taxationController {

    @Autowired
    private taxationService taxServ;

    @PostMapping
    public ResponseEntity createdTax(@RequestBody calculatedTaxation tax){
        try {
            return ResponseEntity.ok(taxServ.createTax(tax));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity check(){
        try {
            return ResponseEntity.ok().body(taxServ.checkTax());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Нет Записей");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteTax(@PathVariable Long id){
        try {
            return ResponseEntity.ok(taxServ.deleteTax(id));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
