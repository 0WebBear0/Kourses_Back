package com.webbear.buisnes_calc.repository;

import com.webbear.buisnes_calc.entity.userEntity;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<userEntity, Long> {
    userEntity findByUsername(String username);
}
