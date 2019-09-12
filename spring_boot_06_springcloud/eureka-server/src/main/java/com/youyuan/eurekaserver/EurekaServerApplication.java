package com.youyuan.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangyu
 * @description springboot整合springcloud
 * @date 2018/12/28 19:41
 *
 * @EnableEurekaServer 标注在主程序上，表示开启eureka服务
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}

