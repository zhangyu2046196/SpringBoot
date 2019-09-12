package com.youyuan.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyu
 * @version 1.0
 * @description mybatis配置类，可以修改配置的属性
 * @date 2018/12/17 16:42
 */
@MapperScan(value = "com.youyuan.springboot.mapper")
@Configuration
public class MyBatisConfig {

    /**
     * mybatis属性注册ioc容器
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);//开启驼峰命名规则
            }
        };
    }

}
