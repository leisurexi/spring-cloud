package com.leisurexi.user.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: leisurexi
 * @date: 2020-05-06 23:37
 * @since JDK 1.8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSvcApplication.class);
    }

}
