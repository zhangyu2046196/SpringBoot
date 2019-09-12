package com.youyuan.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot整合elastisearch主程序
 * @date 2018/12/26 23:02
 *
 * springboot和elasticsearch交互的方式
 * 1、Jest
 * 	需要导入jest包   (io.searchbox.*)
 * 2、springdata 和 elasticsearch 交互的方式
 * 	2.1、TransportClient
 * 	2.2、ElasticsearchTemplate
 * 	2.3、编写一个接口继承ElasticsearchRepository接口
 *
 */
@SpringBootApplication
public class SpringBoot03ElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot03ElasticsearchApplication.class, args);
	}

}

