package com.youyuan.consumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyu
 * @description 服务消费者主程序
 * @date 2018/12/28 22:22
 *
 * @EnableDiscoveryClient 开启服务发现功能
 *
 */
@EnableDiscoveryClient  //开启服务发现功能
@SpringBootApplication
public class ConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerUserApplication.class, args);
	}

	/**
	 * 将RestTemplate注册到容器，用于向注册中心eureka发送请求获取请求地址
	 * @LoadBalanced 用于开启负载均衡策略
	 * @return
	 */
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();//RestTemplate注册到容器用于向注册中心eureka发送请求
	}

}

