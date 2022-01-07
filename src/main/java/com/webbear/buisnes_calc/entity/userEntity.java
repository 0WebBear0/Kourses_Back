package com.webbear.buisnes_calc.entity;


import javax.persistence.*;
import java.util.List;


@Entity
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userEntity")
    private List<calculatedTaxation> taxations;

    public userEntity(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
