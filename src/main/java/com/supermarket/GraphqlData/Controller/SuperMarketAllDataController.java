package com.supermarket.GraphqlData.Controller;

import com.supermarket.GraphqlData.Dto.*;
import com.supermarket.GraphqlData.Service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/allData")
public class SuperMarketAllDataController {

    private final AllDataService allDataService;

    @Autowired
    public SuperMarketAllDataController(AllDataService allDataService) {
        this.allDataService = allDataService;
    }

    @QueryMapping
    public List<AllTypeDto> getAllData(){
        return allDataService.GetAllData();
    }

    @QueryMapping
    public AllTypeDto getDataById(@Argument String id){
        return allDataService.GetRecordById(id);
    }

    @QueryMapping
    public long getRecordCount(){
        return allDataService.GetCountOfAllRecords();
    }

    @QueryMapping
    public List<AllBranchCount_Dto> getAllSalesOfBranches(){
        return allDataService.GetAllBranchSales();
    }

    @QueryMapping
    public List<AllDataRespose_Dto> getAllDateSales(){
        return allDataService.GetAllDates();
    }

    @QueryMapping
    public List<AllGenderData_Dto> getAllGenderData(){
        return allDataService.getAllGenderData();
    }

    @QueryMapping
    public List<AllPaymentMethodes_Dto> getAllPaymentData(){
        return allDataService.GetAllPaymentMethods();
    }

    @QueryMapping
    public List<AllTypeDto> getAllDataByProductLine(@Argument String productLine){
        return allDataService.GetAllDataByProductLine(productLine);
    }
}
