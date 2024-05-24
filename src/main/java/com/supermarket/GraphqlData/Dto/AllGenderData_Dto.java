package com.supermarket.GraphqlData.Dto;

public class AllGenderData_Dto {

    private String gender;
    private Integer count;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public AllGenderData_Dto(String gender, Integer count) {
        this.gender = gender;
        this.count = count;
    }
}
