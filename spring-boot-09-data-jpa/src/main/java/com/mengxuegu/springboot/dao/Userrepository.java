package com.mengxuegu.springboot.dao;

import com.mengxuegu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Integer> {


}
