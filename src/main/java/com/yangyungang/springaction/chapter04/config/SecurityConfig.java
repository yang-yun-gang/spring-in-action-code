package com.yangyungang.springaction.chapter04.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description : 安全配置类
 * @Author : young
 * @Date : 2023-07-09 20:17
 * @Version : 1.0
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 基于内存的用户存储
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and()
                .withUser("admin").password("password").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 1.formLogin()启动默认登录页
        // 2.对/springinaction/authtest进行验证，其他都不需要验证
        http.csrf().disable();
        http.formLogin().and().authorizeRequests().antMatchers("/springinaction/authtest").authenticated()
                .anyRequest().permitAll();
    }
}
