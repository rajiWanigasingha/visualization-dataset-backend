package com.supermarket.GraphqlData.Dto;

public class AllBranchCount_Dto {

    private String branch;
    private Long count;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public AllBranchCount_Dto(String branch, Long count) {
        this.branch = branch;
        this.count = count;
    }
}
