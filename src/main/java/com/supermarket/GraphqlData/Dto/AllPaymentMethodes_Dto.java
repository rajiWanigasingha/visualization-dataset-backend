package com.supermarket.GraphqlData.Dto;

public class AllPaymentMethodes_Dto {

    private String payment;
    private Long count;

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public AllPaymentMethodes_Dto(String payment, Long count) {
        this.payment = payment;
        this.count = count;
    }
}
