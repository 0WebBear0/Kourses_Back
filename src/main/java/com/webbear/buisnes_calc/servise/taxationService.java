package com.webbear.buisnes_calc.servise;

import com.webbear.buisnes_calc.entity.calculatedTaxation;
import com.webbear.buisnes_calc.entity.userEntity;
import com.webbear.buisnes_calc.repository.taxRepo;
import com.webbear.buisnes_calc.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class taxationService {

    @Autowired
    private taxRepo taxRepo;

    @Autowired
    private userRepo userRep;


    public calculatedTaxation createTax(calculatedTaxation tax, Long userId){
        userEntity user = userRep.findById(userId).get();
        tax.setUserEntity(user);
        return taxRepo.save(tax);
    }
    public Boolean deleteTax(Long userId){
        taxRepo.deleteById(userId);
        return true;
    }
}
