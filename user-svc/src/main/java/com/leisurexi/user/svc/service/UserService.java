package com.leisurexi.user.svc.service;

import com.leisurexi.user.api.domain.User;
import com.leisurexi.user.api.client.UserClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: leisurexi
 * @date: 2020-05-07 20:10
 * @since JDK 1.8
 */
@Service
public class UserService {

    private final Map<Long, User> repository = new ConcurrentHashMap<>();

    public boolean save(User user) {
        return repository.put(user.getId(), user) == null;
    }

    public List<User> users() {
        return new ArrayList<>(repository.values());
    }

}
