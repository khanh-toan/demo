package com.khanhtoan.demo.service.impl;

import com.khanhtoan.demo.entity.Role;
import com.khanhtoan.demo.entity.User;
import com.khanhtoan.demo.repository.RoleRepository;
import com.khanhtoan.demo.repository.UserRepository;
import com.khanhtoan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addToUserRole(String email, String roleName) {
        User user = userRepository.findByEmail(email);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }
}
