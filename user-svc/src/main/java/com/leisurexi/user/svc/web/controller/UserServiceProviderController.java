package com.leisurexi.user.svc.web.controller;

import com.leisurexi.user.api.domain.User;
import com.leisurexi.user.svc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: leisurexi
 * @date: 2020-05-07 20:25
 * @since JDK 1.8
 */
@RefreshScope
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserServiceProviderController {

    private final UserService userService;

    @Value("${user.id}")
    private Long id;

    @Value("${user.nickname}")
    private String name;

    @Value("${server.port}")
    private int port;

    @PostMapping()
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping()
    public List<User> users() {
        return userService.users();
    }

    @GetMapping("/config-test")
    public User user() {
        User user = User.builder()
                .id(id)
                .name(name)
                .build();
        return user;
    }

    @GetMapping("/load-balance-test")
    public String loadBalanceTest() {
        return "Hi, I'm " + port + " port";
    }

}
