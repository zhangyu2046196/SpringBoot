package com.youyuan.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot整合dubbo服务消费者主程序
 * @date 2018/12/28 14:24
 *
 * 步骤
 * 1、导入dubbo的starter包
 * 2、导入zkClient包
 * 3、springboot的yml配置文件配置信息
 * 	3.1、服务名称
 * 	3.2、注册中心地址
 * 4、用@Reference标注消费者消费接口
 * 5、在主程序或配置类用@EnableDubbo标注基于注解的dubbo
 *
 */
@EnableDubbo
@SpringBootApplication
public class ConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerUserApplication.class, args);
	}

}

