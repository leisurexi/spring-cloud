package com.leisurexi.user.api.client;

import com.leisurexi.user.api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author: leisurexi
 * @date: 2020-05-07 20:11
 * @since JDK 1.8
 */
@FeignClient(value = "user-service-provider")
public interface UserClient {

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @PostMapping("/users")
    boolean save(User user);

    /**
     * 获取用户列表
     *
     * @return
     */
    @GetMapping("/users")
    List<User> users();

    /**
     * 负载均衡测试
     *
     * @return
     */
    @GetMapping("/users/load-balance-test")
    String loadBalanceTest();

}
