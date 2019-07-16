package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Provider;
import com.mengxuegu.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class Providercontroller {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/providers")
    public List list() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from provider");
        System.out.println(maps);
        return maps;
    }

    @Autowired
    ProviderMapper providerMapper;

    @ResponseBody
    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid) {
        Provider providerByPid = providerMapper.selectbyid(pid);
        return providerByPid;
    }

    @ResponseBody
    @GetMapping("/provider")
    public Provider addProvider(Provider provider) {
        providerMapper.insert (provider);
        return provider;
    }

}

