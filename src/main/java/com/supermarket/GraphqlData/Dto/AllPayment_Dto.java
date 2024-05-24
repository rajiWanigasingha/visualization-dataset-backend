package com.supermarket.GraphqlData.Dto;

public class AllPayment_Dto {

    private String payment;

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public AllPayment_Dto(String payment) {
        this.payment = payment;
    }
}
