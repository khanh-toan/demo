package com.khanhtoan.demo;

import com.khanhtoan.demo.entity.Student;
import com.khanhtoan.demo.repository.StudentRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
/**
 * Khi đánh dấu một class là @DataJpaTest.
 * Spring Boot sẽ load lên tất cả các Bean có liên quan tới tầng Repository
 * Thay vì load hết tất cả Bean như là @SpringBootTest
 */
@DataJpaTest
public class DataJpaAnnotationTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void allComponentAreNotNull() {
        Assertions.assertThat(entityManager).isNotNull();
        Assertions.assertThat(studentRepository).isNotNull();
    }

    @Test
    public void testStudentRepository() {
        Student student = new Student();
        student.setId(1);
        Student student1 = new Student();
        student1.setId(2);
        studentRepository.save(student);
        studentRepository.save(student1);
        Assertions.assertThat(studentRepository.findAll()).hasSize(2);
//        Assertions.assertThat(userRepository.findByEmail("alice@example.com").getEmail()).isEqualTo("alice@example.com");
    }



}
