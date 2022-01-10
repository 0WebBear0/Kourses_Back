package com.webbear.buisnes_calc.exeptions;

public class UserAlreadyExist extends Exception {
    public UserAlreadyExist(String message) {
        super(message);
    }
}
