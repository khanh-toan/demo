package com.khanhtoan.demo.service.impl;

import com.khanhtoan.demo.entity.Teacher;
import com.khanhtoan.demo.repository.TeacherRepository;
import com.khanhtoan.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepository.findAll();
    }
}
