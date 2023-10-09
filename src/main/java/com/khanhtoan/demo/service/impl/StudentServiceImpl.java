package com.khanhtoan.demo.service.impl;

import com.khanhtoan.demo.entity.Student;
import com.khanhtoan.demo.repository.StudentRepository;
import com.khanhtoan.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Iterable<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(int id) {
        return studentRepository.findById(id);
    }
}
