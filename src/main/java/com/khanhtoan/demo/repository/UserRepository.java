package com.khanhtoan.demo.repository;

import com.khanhtoan.demo.entity.Teacher;
import com.khanhtoan.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
