package com.khanhtoan.demo;

import com.khanhtoan.demo.entity.Teacher;
import com.khanhtoan.demo.repository.StudentRepository;
import com.khanhtoan.demo.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;


@SpringBootApplication
//@RequiredArgsConstructor
public class AssigmentApplication {
    public static void main(String[] args) {
//        ApplicationContext context =
                SpringApplication.run(AssigmentApplication.class, args);
//        StudentRepository studentRespository = context.getBean(StudentRepository.class);
//        TeacherRepository teacherRepositoryRespository = context.getBean(TeacherRepository.class);
//        teacherRepositoryRespository.findAll().forEach(System.out::println);
//
//        Optional<Teacher> teacher = teacherRepositoryRespository.findById(2);
//        System.out.println(studentRespository.findById(1).get().getUser().getName());

    }


}
