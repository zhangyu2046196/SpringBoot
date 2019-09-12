package com.youyuan.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description springboot整合dubbo服务提供者主程序
 * @date 2018/12/28 14:12
 *
 * 步骤:
 * 1、引入dubbo的starter包
 * 2、因为注册中心是zookeeper开发，引入zkclient客户端包
 * 3、springboot的yml配置文件编写dubbo的配置信息
 * 	3.1、指定服务名称
 * 	3.2、指定注册中心地址
 * 	3.3、指定包扫描的路径
 * 4、使用@Service发布服务
 * 5、在主程序或配置类使用@EnableDubbo注解 打开基于注解的dubbo
 *
 */
@EnableDubbo
@SpringBootApplication
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}

