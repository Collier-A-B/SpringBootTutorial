package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.setter_injection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.setter_injection")
public class AppConfig {
    /* Alternate way using Java-Based config 
    @Bean
    public Student student(@Value("John") String studentName, 
                           @Value("Spring Framework") String studentCourse) {
        Student student = new Student();
        student.setStudentName(studentName);
        student.setStudentCourse(studentCourse);
        return student;
    }
    */
}
