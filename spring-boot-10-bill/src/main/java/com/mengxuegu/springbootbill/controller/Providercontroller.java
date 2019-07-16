package com.mengxuegu.springbootbill.controller;

import com.mengxuegu.springbootbill.dao.ProviderDao;
import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class Providercontroller {
    Logger logger = LoggerFactory.getLogger(getClass());
//    @Autowired
//    ProviderDao providerDao;
    @Autowired
    ProviderMapper providerMapper;


    @GetMapping("/providers")
    String providers(Map<String, Object> map,Provider provider) {
        logger.info("供应商查询.................." + provider);

        List<Provider> providers = providerMapper.getproviders(provider);
        map.put("providers", providers);
        map.put("providerName", provider.getProviderName());//回显
        return "provider/list";
    }
//
//    @RequestMapping("/provider")
//    String provider() {
//        return "provider/list";
//    }

    @GetMapping("/provider/{pid}")
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

    }


}
