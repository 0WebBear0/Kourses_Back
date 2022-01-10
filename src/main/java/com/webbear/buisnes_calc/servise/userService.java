package com.webbear.buisnes_calc.servise;

import com.webbear.buisnes_calc.entity.userEntity;
import com.webbear.buisnes_calc.exeptions.UserAlreadyExist;
import com.webbear.buisnes_calc.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    private userRepo userRep;

    public userEntity registrations(userEntity user) throws UserAlreadyExist {
        if (userRep.findByUsername(user.getUsername()) != null){
            throw new UserAlreadyExist("Пользователь с таким именем существует, введите другое имя");
        }
        return userRep.save(user);
    }
}
