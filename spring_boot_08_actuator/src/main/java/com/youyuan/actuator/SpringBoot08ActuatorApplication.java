package com.youyuan.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot监控actuator主程序
 * @date 2018/12/29 15:36
 *
 * 自定义HealthIndicator 指示器步骤
 * 1、编写类继承HealthIndicator
 * 2、把类注册到容器
 * 3、类的名字必须是xxxHealthIndicator
 *
 */
@SpringBootApplication
public class SpringBoot08ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08ActuatorApplication.class, args);
	}

}

