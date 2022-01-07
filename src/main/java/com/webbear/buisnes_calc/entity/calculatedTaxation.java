package com.webbear.buisnes_calc.entity;

import javax.persistence.*;

@Entity
public class calculatedTaxation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Name;
    private String income;
    private String costs;
    private String taxRate;
    private String paymentMargin;
    private String paymentCosts;

    @ManyToOne
    @JoinColumn(name = "userEntity_id")
    private userEntity userEntity;

    public calculatedTaxation(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCosts() {
        return costs;
    }

    public void setCosts(String costs) {
        this.costs = costs;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getPaymentMargin() {
        return paymentMargin;
    }

    public void setPaymentMargin(String paymentMargin) {
        this.paymentMargin = paymentMargin;
    }

    public String getPaymentCosts() {
        return paymentCosts;
    }

    public void setPaymentCosts(String paymentCosts) {
        this.paymentCosts = paymentCosts;
    }

    public com.webbear.buisnes_calc.entity.userEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(com.webbear.buisnes_calc.entity.userEntity userEntity) {
        this.userEntity = userEntity;
    }
}
