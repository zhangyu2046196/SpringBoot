package com.youyuan.springboot.amqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyu
 * @version 1.0
 * @description rabbitmq配置类，用于自定义序列化
 * @date 2018/12/21 21:40
 */
@Configuration
public class MyAmqpConfig {

    /**
     * 自定义序列化，默认是jdk序列化，定义成json
     * @return
     */
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
