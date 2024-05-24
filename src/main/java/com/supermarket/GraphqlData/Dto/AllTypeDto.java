package com.supermarket.GraphqlData.Dto;

public class AllTypeDto {
    private String _id;
    private String invoiceId;
    private String branch;
    private String city;
    private String customerType;
    private String gender;
    private String productLine;
    private double unitPrice;
    private Integer quantity;
    private double taxFive;
    private double total;
    private String date;
    private String time;
    private String payment;
    private double cogs;
    private double grossMarginPercentage;
    private double grossIncome;
    private double rating;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTaxFive() {
        return taxFive;
    }

    public void setTaxFive(double taxFive) {
        this.taxFive = taxFive;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public double getCogs() {
        return cogs;
    }

    public void setCogs(double cogs) {
        this.cogs = cogs;
    }

    public double getGrossMarginPercentage() {
        return grossMarginPercentage;
    }

    public void setGrossMarginPercentage(double grossMarginPercentage) {
        this.grossMarginPercentage = grossMarginPercentage;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double isRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public AllTypeDto(String _id, String invoiceId, String branch, String city, String customerType, String gender, String productLine, double unitPrice, Integer quantity, double taxFive, double total, String date, String time, String payment, double cogs, double grossMarginPercentage, double grossIncome, double rating) {
        this._id = _id;
        this.invoiceId = invoiceId;
        this.branch = branch;
        this.city = city;
        this.customerType = customerType;
        this.gender = gender;
        this.productLine = productLine;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.taxFive = taxFive;
        this.total = total;
        this.date = date;
        this.time = time;
        this.payment = payment;
        this.cogs = cogs;
        this.grossMarginPercentage = grossMarginPercentage;
        this.grossIncome = grossIncome;
        this.rating = rating;
    }
}
