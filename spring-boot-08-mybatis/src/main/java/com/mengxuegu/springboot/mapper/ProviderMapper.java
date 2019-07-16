package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;

//@Mapper
//scanner 了
public interface ProviderMapper {
    @Select("select * from provider where pid=#{pid}")
    Provider selectbyid(Integer pid);

    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("insert into provider (providerName) values(#{providerName})")
    int insert(Provider provider);

    @Update("update provider set providerName=#{providerName} where pid =#{pid}")
    int update(Provider provider);

    @Delete("delete from provider where pid=#{pid}")
    int delete(Integer pid);

}
