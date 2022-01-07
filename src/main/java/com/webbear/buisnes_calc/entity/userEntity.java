package com.webbear.buisnes_calc.entity;


import javax.persistence.*;
import java.util.List;


@Entity
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userEntity")
//    private List<calculatedTaxation> taxations;

    public userEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
