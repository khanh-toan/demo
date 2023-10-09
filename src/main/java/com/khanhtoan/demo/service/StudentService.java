package com.khanhtoan.demo.service;

import com.khanhtoan.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface StudentService {
    Iterable<Student> findAllStudent();

    Optional<Student> findStudentById(int id);
}
