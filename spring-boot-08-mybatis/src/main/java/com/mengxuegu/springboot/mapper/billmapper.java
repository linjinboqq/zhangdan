package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Bill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface billmapper {

    Bill getbyid(Integer bid);
    int addbill (Bill bill);
}
