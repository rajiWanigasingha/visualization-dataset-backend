package com.supermarket.GraphqlData.Service;

import com.supermarket.GraphqlData.Dto.*;
import com.supermarket.GraphqlData.Repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AllDataService {

    private final SuperMarketRepository superMarketRepository;

    @Autowired
    public AllDataService(SuperMarketRepository superMarketRepository) {
        this.superMarketRepository = superMarketRepository;
    }

    public List<AllTypeDto> GetAllData(){
        return superMarketRepository.getAllData();
    }

    public AllTypeDto GetRecordById(String id){
        return superMarketRepository.getRecordById(id);
    }

    public long GetCountOfAllRecords(){
        return superMarketRepository.count();
    }

    public List<AllBranchCount_Dto> GetAllBranchSales(){
        List<AllBranch_Dto> allBranchDtos = superMarketRepository.getAllBranch();

        Map<String ,Long> map = allBranchDtos.stream()
                .collect(Collectors.groupingBy(AllBranch_Dto::getBranch, Collectors.counting()));

        return map.entrySet().stream().
                map(entity -> new AllBranchCount_Dto(entity.getKey(), entity.getValue()))
                .collect(Collectors.toList());
    }

    public List<AllDataRespose_Dto> GetAllDates(){
        List<AllDate_dto> allDateDtos = superMarketRepository.getAllDate();
        List<AllDataRespose_Dto> allDataResposeDtos = new ArrayList<>();

        Map<String, Integer> monthCountMap = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            String monthName = Month.of(i).name();
            monthCountMap.put(monthName, 0);
        }

        for (AllDate_dto values:allDateDtos){
            String Date = values.getDate();
            String MonthName = Month.of(Character.getNumericValue(Date.charAt(0))).name();
            Integer count = monthCountMap.get(MonthName);
            monthCountMap.put(MonthName ,count + 1);
        }

        return monthCountMap.entrySet().stream().
                map(entity -> new AllDataRespose_Dto(entity.getKey(),entity.getValue()))
                .collect(Collectors.toList());
    }

    public List<AllGenderData_Dto> getAllGenderData(){

        List<AllGender_Dto> allGenderDtos = superMarketRepository.getAllGenderData();

        int femaleCount = 0;
        int maleCount = 0;

        for (AllGender_Dto data:allGenderDtos){
            if (data.getGender().equals("Female")){
                femaleCount = femaleCount + 1;
            }else{
                maleCount = maleCount + 1;
            }
        }

        List<AllGenderData_Dto> allGenderDataDtos = new ArrayList<>();

        allGenderDataDtos.add(0,new AllGenderData_Dto("Female",femaleCount));
        allGenderDataDtos.add(1,new AllGenderData_Dto("Male",maleCount));

        return allGenderDataDtos;
    }


    public List<AllPaymentMethodes_Dto> GetAllPaymentMethods(){

        List<AllPayment_Dto> allPaymentDtos = superMarketRepository.getAllPaymentTypes();

        Map<String ,Long> map = allPaymentDtos.stream().collect(Collectors.groupingBy(AllPayment_Dto::getPayment ,Collectors.counting()));

        return map.entrySet().stream().
                map(entity -> new AllPaymentMethodes_Dto(entity.getKey() ,entity.getValue())).collect(Collectors.toList());
    }

    public List<AllTypeDto> GetAllDataByProductLine(String productLine){
        return superMarketRepository.getDataByProductLine(productLine);
    }

}
