package com.mengxuegu.springbootbill.controller;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import com.mengxuegu.springbootbill.mapper.billmapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BillController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    billmapper billmapper;
    @Autowired
    ProviderMapper providerMapper;


    @GetMapping("/bills")
    String providers(Map<String, Object> map, Bill bill) {
        logger.info("账单查询.................." + bill);
        List<BillProvider> billProviders = billmapper.getbill(bill);
        System.out.println(billProviders);
//        查供应商
        List<Provider> providers = providerMapper.getproviders(null);
        map.put("providers",providers);
        map.put("billProviders", billProviders);
        map.put("billName",bill.getBillName());//回显
        map.put("pid",bill.getPid());//回显
        map.put("pay",bill.getPay());//回显
        return "bill/list";
    }
    @GetMapping("/bill/{bid}")
//    pathvariable 不是param
    public String providerdetail(@PathVariable("bid") Integer bid, Map<String, Object> map, @RequestParam(value = "type", defaultValue = "view") String type) {
        logger.info(bid + "查询详情");
        BillProvider billProvider = billmapper.getbillbyid(bid);
        if("update".equals(type)) {
            List<Provider> providers = providerMapper.getproviders(null);
            map.put("providers",providers);
        }
        map.put("billProvider",billProvider);
        return "bill/" + type;
    }
    @PutMapping("/bill")
    public String update(Bill bill) {
        logger.info("update .....");
       billmapper.updatebill(bill);
        return "redirect:bills";
    }

    @GetMapping("/bill")
    public String toaddpage(Bill bill ,Map<String,Object> map ){
        logger.info("add.....bill" );
        map.put("providers",providerMapper.getproviders(null));
        return "bill/add";
    }
    @PostMapping("/bill")
    public String add(Bill bill) {
        logger.info("add....." + bill);
        billmapper.addbill(bill);
        return "redirect:/bills";
    }
    @DeleteMapping("/bill/{bid}")
    public String delete(@PathVariable("bid") Integer bid) {
        logger.info("删除" + bid);
        billmapper.delectbillbyid(bid);
        return "redirect:/bills";

    }
//
//    @RequestMapping("/provider")
//    String provider() {
//        return "provider/list";
//    }

   /* @GetMapping("/provider/{pid}")
//    pathvariable 不是param
    public String providerdetail(@PathVariable("pid") Integer pid, Map<String, Provider> map, @RequestParam(value = "type", defaultValue = "view") String type) {
        logger.info(pid + "查询详情");
        Provider provider1 = providerMapper.getpvoviderbyid(pid);
//        Provider provider = providerDao.getProvider(pid);
        map.put("provider", provider1);
        return "provider/" + type;
    }

    //    修改供应商信息put
    @PutMapping("/provider")
    public String update(Provider provider) {
        logger.info("update ''''");
//        providerDao.save(provider);
        providerMapper.updatepro(provider);
        return "redirect:providers";
    }

    @GetMapping("/provider")
    public String toadd() {
        return "provider/add";
    }

    @PostMapping("/provider")
    public String add(Provider provider) {
        logger.info("add....." + provider);
//        providerDao.save(provider);
        providerMapper.addpro(provider);
        return "redirect:/providers";
    }

    @DeleteMapping("/provider/{pid}")
    public String delete(@PathVariable("pid") Integer pid) {
        logger.info("删除" + pid);
//        providerDao.delete(pid);
        providerMapper.deletepro(pid);
        return "redirect:/providers";

    }*/


    }