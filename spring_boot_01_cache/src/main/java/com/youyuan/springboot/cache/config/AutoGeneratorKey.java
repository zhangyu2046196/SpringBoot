package com.youyuan.springboot.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author zhangyu
 * @version 1.0
 * @description 自定义generatorkey
 * @date 2018/12/19 16:46
 */
@Configuration
public class AutoGeneratorKey {

    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName() + Arrays.asList(objects).toString();
            }
        };
    }
}
