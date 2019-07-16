package com.mengxuegu.springbootbill;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.mapper.ProviderMapper;
import com.mengxuegu.springbootbill.mapper.billmapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBillApplicationTests {

@Autowired
    ProviderMapper providerMapper;
    @Test
    public void contextLoads() {
        Provider provider = new Provider();
        provider.setProviderName("A货");
        List<Provider> getproviders = providerMapper.getproviders(provider);
        System.out.println(getproviders.get(0));
        Provider getpvoviderbyid = providerMapper.getpvoviderbyid(2);
        System.out.println(getpvoviderbyid);
        getpvoviderbyid.setProviderName("name.....");
        int updatepro = providerMapper.updatepro(getpvoviderbyid);
        providerMapper.addpro(new Provider(null, "PR-AA", "梦学谷供应商111",
                "小张", "18888666981",
                "深圳软件园", "0911-0123456",
                "品质A"));
        providerMapper.deletepro(4);

        System.out.println(updatepro);
    }


        @Autowired
        billmapper billMapper;
        @Test
       public  void  billtest(){
            Bill bill = new Bill();
            bill.setBillName("com");
            List<BillProvider> getbill = billMapper.getbill(bill);

            System.out.println(getbill.get(0));
            BillProvider provider = billMapper.getbillbyid(3);
            System.out.println(provider);
            Bill bill1 =(Bill)provider;
            bill1.setBillName("name9999999");
            billMapper.updatebill(bill1);

            billMapper.delectbillbyid(7);
            Bill bill2 = new Bill(3001,
                    "Bi-AA11", "粮油aaa",
                    "斤", 80, 480.8,
                    new Provider(null, "PR-BB",
                            "梦学谷供应商222", "小李",
                            "18888666982", "深圳软件园",
                            "0911-0123453", "品质B"), 1);
//            billMapper.addbill(bill2);

        }

}
