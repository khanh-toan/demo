package com.khanhtoan.demo.service;

import com.khanhtoan.demo.entity.Role;
import com.khanhtoan.demo.entity.User;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addToUserRole(String email, String roleName);
}
