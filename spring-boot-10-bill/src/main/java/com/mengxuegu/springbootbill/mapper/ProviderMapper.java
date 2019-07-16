package com.mengxuegu.springbootbill.mapper;

import com.mengxuegu.springbootbill.entities.Provider;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
//scanner 了
@Mapper
public interface ProviderMapper {
   List<Provider> getproviders(Provider provider);
   Provider getpvoviderbyid(Integer pid);
   int addpro(Provider provider);
   int updatepro(Provider provider);
   int deletepro (Integer pid);


}
