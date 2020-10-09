package com.yu;

import com.yu.controller.UserController;
import com.yu.mapper.UserMapper;
import com.yu.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

import java.nio.charset.StandardCharsets;

@SpringBootApplication
@MapperScan("com.yu.mapper")//扫描包!!!!!
@EnableDiscoveryClient//开启eureka客户端发现功能
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class);
    }
}
