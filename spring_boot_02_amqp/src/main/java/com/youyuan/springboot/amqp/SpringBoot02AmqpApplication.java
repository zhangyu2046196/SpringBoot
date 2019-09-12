package com.youyuan.springboot.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot集成rabbitmq
 * @date 2018/12/21 21:22
 *
 * 一、集成步骤
 * 	1、导入rabbitmq的starter
 * 	2、在application.yml配置文件中配置rabbitmq的配置信息
 * 二、自动配置
 *	1、自动配置类
 *		RabbitAutoConfiguration
 *  2、配置文件类
 *  	RabbitProperties
 *  3、连接工厂
 *  	ConnectionFactory
 *  4、数据发送和接收类
 *  	RabbitTemplate
 *  5、amqpadmin管理组件
 *  	AmqpAdmin可以管理组件(exchange、queue、binding)
 *  6、创建监听器，来监听接收消息
 *  	6.1、需要在配置类上通过注解@EnableRabbit打开基于注解的rabbitmq
 *  	6.2、编写业务类通过注解@RabbitListener监听
 * 三、自定义序列化(默认是采用jdk序列化)
 *	MyAmqpConfig(自定义配置类)
 */
@EnableRabbit
@SpringBootApplication
public class SpringBoot02AmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02AmqpApplication.class, args);
	}

}

