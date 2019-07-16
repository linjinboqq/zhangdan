package com.mengxuegu.springboot02config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;
@PropertySource(value = {"classpath:emp.properties"})
@Component// 作为组件让spring管理
@ConfigurationProperties(prefix = ("emp"))//绑定
public class emp {
//    @Value("20")
    private Integer age;
    @Value("${emp.lastname}")
    private String lastName;
//    @Value(("#{5*100}"))
    private Double salary;
    private Boolean aBoolean;
    private Data birthtday;
    private Map map;
    private List list;
    private  Forte forte;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Data getBirthtday() {
        return birthtday;
    }

    public void setBirthtday(Data birthtday) {
        this.birthtday = birthtday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

    @Override
    public String toString() {
        return "emp{" +
                "age=" + age +
                ", lastname='" + lastName + '\'' +
                ", salary=" + salary +
                ", aBoolean=" + aBoolean +
                ", birthtday=" + birthtday +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }
}
