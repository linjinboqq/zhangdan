package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Bill;
import com.mengxuegu.springboot.mapper.billmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class billcontroller {

    @Autowired
    billmapper billmapper;
    @ResponseBody
    @GetMapping("/bill/{bid}")
    public Bill getbillbyid(@PathVariable("bid") Integer bid) {
//        billmapper.addbill()
        Bill bi = billmapper.getbyid(bid);
        return bi;
    }
    @GetMapping("bill")
    @ResponseBody
    public  Bill addbill(Bill bill){
        int i = billmapper.addbill(bill);
        return bill;
    }
}
