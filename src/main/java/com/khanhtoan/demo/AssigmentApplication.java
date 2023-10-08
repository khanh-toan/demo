package com.khanhtoan.demo;

import com.khanhtoan.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssigmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssigmentApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(TeacherRepository teacherRepository){
		return runner -> {
			//findTeacherBy(teacherRepository);
			findStudentBy(teacherRepository);
		};
	}*/

	/*private void findStudentBy(TeacherRepository teacherRepository) {
		int id = 1;
		Student s = teacherRepository.findStudentById(id);
		if(s != null && s.getUser() != null){
			System.out.println("Tên sinh vien: " + s.getUser().getName());
		}else{
			System.out.println("Không tìm thấy sinh viên với id: " +  id);
		}
	}*/

	/*private void findTeacherBy(TeacherRepository userRepository) {
		int teacherId = 1; // Thay đổi id giáo viên tại đây
		Teacher teacher = userRepository.findById(teacherId);
		if (teacher != null && teacher.getUser() != null) {
			System.out.println("Tên giáo viên: " + teacher.getUser().getName());
		} else {
			System.out.println("Không tìm thấy giáo viên với id: " + teacherId);
		}
	}*/
}
