package com.webbear.buisnes_calc.servise;

import com.webbear.buisnes_calc.entity.calculatedTaxation;
import com.webbear.buisnes_calc.repository.taxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class taxationService {

    @Autowired
    private taxRepo taxRepo;

    public calculatedTaxation createTax(calculatedTaxation tax){
        return taxRepo.save(tax);
    }

    public Boolean deleteTax(Long userId){
        taxRepo.deleteById(userId);
        return true;
    }

    public Iterable<calculatedTaxation> checkTax(){
        return taxRepo.findAll();
    }
}
