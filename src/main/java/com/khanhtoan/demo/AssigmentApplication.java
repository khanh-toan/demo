package com.khanhtoan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssigmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssigmentApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(TeacherRepository teacherRepository){
		return runner -> {
			findTeacherBy(teacherRepository);
		};
	}

	private void findTeacherBy(TeacherRepository userRepository) {
		int teacherId = 1; // Thay đổi id giáo viên tại đây
		Teacher teacher = userRepository.findById(teacherId);
		if (teacher != null && teacher.getUser() != null) {
			System.out.println("Tên giáo viên: " + teacher.getUser().getName());
		} else {
			System.out.println("Không tìm thấy giáo viên với id: " + teacherId);
		}
	}*/
}
