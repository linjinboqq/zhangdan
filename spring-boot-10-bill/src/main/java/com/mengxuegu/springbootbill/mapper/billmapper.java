package com.mengxuegu.springbootbill.mapper;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface billmapper {

   List<BillProvider> getbill(Bill bill);
   BillProvider getbillbyid(Integer bid);
   int addbill(Bill bill);
    int updatebill(Bill bill);
    int delectbillbyid(Integer bid);
}
