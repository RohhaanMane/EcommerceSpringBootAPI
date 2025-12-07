package com.rohan.app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    private Long id = 1L;

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user)
    {
        user.setId(id++);
        users.add(user);
    }
}
