package com.mengxuegu.springboot04web.bean;

import java.io.Serializable;

public class user    {
    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;
}
