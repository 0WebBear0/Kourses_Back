package com.webbear.buisnes_calc.repository;

import com.webbear.buisnes_calc.entity.calculatedTaxation;
import org.springframework.data.repository.CrudRepository;

public interface taxRepo extends CrudRepository<calculatedTaxation, Long> {

}
