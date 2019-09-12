package com.youyuan.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot整合security框架主程序
 * @date 2018/12/27 23:04
 *
 * 步骤
 * 	1、引入spring-boot-starter-security 启动器包
 * 	2、编写配置类继承WebSecurityConfigurationAdapta
 *
 */
@SpringBootApplication
public class SpringBoot05SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot05SecurityApplication.class, args);
	}

}

