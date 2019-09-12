package com.youyuan.springboot.repository;

import com.youyuan.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangyu
 * @version 1.0
 * @description dao接口 需要继承JpaRepository
 * @date 2018/12/17 22:36
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
