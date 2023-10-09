package com.khanhtoan.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.khanhtoan.demo.entity.Role;
import com.khanhtoan.demo.entity.Student;
import com.khanhtoan.demo.entity.User;
import com.khanhtoan.demo.repository.StudentRepository;
import com.khanhtoan.demo.service.StudentService;
import com.khanhtoan.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @GetMapping("")
    public ResponseEntity<?> listStudent() {

        return ResponseEntity.ok(teacherService.findAllTeacher());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id) {
        Optional<Student> student = studentService.findStudentById(id);
        return ResponseEntity.ok(student);
    }
}
