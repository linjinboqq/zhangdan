package com.mengxuegu.springbootbill.controller;

import com.mengxuegu.springbootbill.dao.ProviderDao;
import com.mengxuegu.springbootbill.entities.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller
public class Providercontroller {
    /*   @ResponseBody
       @RequestMapping("/")
       String fangfa(){
           return "fangwen成功";
       }*/
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    ProviderDao providerDao;

    @GetMapping("/providers")
    String providers(Map<String, Object> map, @RequestParam(value = "providerName", required = false) String providerName) {
        logger.info("供应商查询.................." + providerName);

        Collection<Provider> providers = providerDao.getAll(providerName);
        map.put("providers", providers);
        map.put("providerName", providerName);
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
        Provider provider = providerDao.getProvider(pid);
        map.put("provider", provider);
        return "provider/" + type;
    }

    //    修改供应商信息put
    @PutMapping("/provider")
    public String update(Provider provider) {
        logger.info("update ''''");
        providerDao.save(provider);
        return "redirect:providers";
    }

    @GetMapping("/provider")
    public String toadd() {
        return "provider/add";
    }

    @PostMapping("/provider")
    public String add(Provider provider) {
        logger.info("add....." + provider);
        providerDao.save(provider);
        return "redirect:/providers";
    }

    @DeleteMapping("/provider/{pid}")
    public String delete(@PathVariable("pid") Integer pid) {
        logger.info("删除" + pid);
        providerDao.delete(pid);
        return "redirect:/providers";

    }


}
