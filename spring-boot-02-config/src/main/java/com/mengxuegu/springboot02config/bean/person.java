package com.mengxuegu.springboot02config.bean;

public class person {
    int age;
    String name;

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
