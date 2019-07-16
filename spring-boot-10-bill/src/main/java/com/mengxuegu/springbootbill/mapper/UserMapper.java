package com.mengxuegu.springbootbill.mapper;

import com.mengxuegu.springbootbill.entities.Provider;
import com.mengxuegu.springbootbill.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
//scanner 了
@Mapper
public interface UserMapper {
   User getUserByUsername(String username);

   List<User> getUsers(User user);

   User getUserById(Integer id);

   int addUser(User user);

   int deleteUserById(Integer id);

   int updateUser(User user);

}


