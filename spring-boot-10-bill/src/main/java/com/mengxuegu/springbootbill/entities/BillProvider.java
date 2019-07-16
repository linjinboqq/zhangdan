package com.mengxuegu.springbootbill.entities;
/*
*
*
* */
public class BillProvider extends  Bill {
    public   String  providerName;

    public String getProviderName() {
        return providerName;
    }

    @Override
    public String toString() {
        return "BillProvider{" +
                "providerName='" + providerName + '\'' +
                ", pay=" + pay +
                ", createDate=" + createDate +
                '}';
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
