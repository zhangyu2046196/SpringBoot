package com.youyuan.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 自定义security配置类需要继承WebSecurityConfigurationAdapa
 * @date 2018/12/27 23:08
 *
 * @EnableWebSecurity 注解开启web安全框架  注解里面使用了@Configuration
 *
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 配置授权规则
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()//添加/访问路径任何角色都可以访问
                .antMatchers("/level1/**").hasRole("VIP1")//菜单1的角色是VIP1
                .antMatchers("/level2/**").hasRole("VIP2")//菜单2的角色是VIP2
                .antMatchers("/level3/**").hasRole("VIP3");//菜单3的角色是VIP3

        http.formLogin();//开启自动配置登录功能，如果没有登录就会自动跳转到自动生成的登录页面  并且访问/login到登录页面

        http.logout().logoutSuccessUrl("/");//开启自动注销功能，注销后可以指定跳转的页面

    }

    /**
     * 配置认证规则

     * passwordEncoder(new BCryptPasswordEncoder())先指定加密方式,security升级到5后需要指定加密方式
     * BCryptPasswordEncoder 加密方法
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("youyuan1").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP1", "VIP2")//添加用户youyuan1的角色是VIP1和VIP2
                .and().withUser("youyuan2").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP2", "VIP3")//添加用户youyuan2的角色是VIP3和VIP2
                .and().withUser("youyuan3").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP1", "VIP3");//添加用户youyuan3的角色是VIP1和VIP3

    }
}
