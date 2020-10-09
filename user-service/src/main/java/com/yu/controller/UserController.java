package com.yu.controller;


import com.yu.pojo.User;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//注入到spring容器
@RestController
@RequestMapping("/user")
@RefreshScope//刷新配置
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${user.name}")
    private String name;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(name);
        User user = userService.queryById(id);
        return user;
    }

    @GetMapping("/username")
    public String printUsername() {
        return name;
    }
}
