package com.leisurexi.user.service.client.web.controller;

import com.leisurexi.user.api.domain.User;
import com.leisurexi.user.api.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: leisurexi
 * @date: 2020-05-07 20:33
 * @since JDK 1.8
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserServiceClientController {

    private final UserClient userClient;

    @PostMapping()
    public boolean save(@RequestBody User user) {
        return userClient.save(user);
    }

    @GetMapping()
    public List<User> users() {
        return userClient.users();
    }

    @GetMapping("/load-balance-test")
    public String loadBalanceTest() {
        return userClient.loadBalanceTest();
    }
}
