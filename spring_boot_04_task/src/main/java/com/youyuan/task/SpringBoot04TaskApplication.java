package com.youyuan.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhangyu
 * @description 异步处理主程序
 * @date 2018/12/27 15:51
 *
 * @EnableAsync开启异步注解
 * @EnableScheduling开启定时任务
 *
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringBoot04TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04TaskApplication.class, args);
	}

}

