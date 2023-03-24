package com.proj.myapp.repository;

import com.proj.myapp.model.appmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface repo extends JpaRepository<appmodel, UUID> {
//    appmodel findByEmailId(String email);
List<appmodel> findAll();

//    @Query(value = "SELECT * FROM customer WHERE acc_no= :accountNo AND ifsc_code= :ifscCode",
//            nativeQuery = true)
//    Customer findByAccountDetails(@Param("accountNo") Long accountNo, @Param("ifscCode")String ifscCode);
}