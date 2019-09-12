package com.youyuan.springboot.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhangyu
 * @description springboot缓存主程序,继承缓存步骤
 * 一、搭建环境
 * 	1、导入mybatis、mysql、cache包、druid(数据源采用druid)
 * 	2、配置文件配置数据源和druid监控信息
 * 	3、创建实体bean
 * 	4、创建mybatis的接口mapper
 * 	5、在配置类通过@MapperScan扫描mapper
 * 	6、编写druid的配置类
 * 二、使用缓存步骤
 * 	1、开启使用缓存注解
 * 	2、标记哪些方式使用缓存
 * 三、使用redis缓存步骤
 * 	1、引入redis的starter
 * 	2、配置文件增加redis的配置
 * @date 2018/12/19 9:53
 */
@EnableCaching
@MapperScan("com.youyuan.springboot.cache.mapper")
@SpringBootApplication
public class SpringBoot01CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01CacheApplication.class, args);
	}

}

