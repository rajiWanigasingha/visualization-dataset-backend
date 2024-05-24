package com.supermarket.GraphqlData.Repository;

import com.supermarket.GraphqlData.Dto.*;
import com.supermarket.GraphqlData.Entity.SuperMarketEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SuperMarketRepository extends MongoRepository<SuperMarketEntity ,String> {

    @Query(value = "{}")
    public List<AllTypeDto> getAllData();

    @Query(value = "{'_id': ?0}")
    public AllTypeDto getRecordById(String _id);

    @Query(value = "{}" ,fields = "{'branch':1}")
    public List<AllBranch_Dto> getAllBranch();

    @Query(value = "{}" ,fields = "{'date':1}")
    public List<AllDate_dto> getAllDate();

    @Query(value = "{}" ,fields = "{'gender':1}")
    public List<AllGender_Dto> getAllGenderData();

    @Query(value = "{}" ,fields = "{payment:1}")
    public List<AllPayment_Dto> getAllPaymentTypes();

    @Query(value = "{productLine:'?0'}")
    public List<AllTypeDto> getDataByProductLine(String productLine);
}
