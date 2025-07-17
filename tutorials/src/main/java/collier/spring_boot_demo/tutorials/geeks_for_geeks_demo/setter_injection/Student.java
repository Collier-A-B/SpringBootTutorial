package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String studentName;
    private String studentCourse;

    // No-argument constructor (required for Setter-Based DI)
    public Student() {
    }

    // Setter methods for Dependency Injection
    @Autowired
    public void setStudentName(@Value("John") String studentName) {
        this.studentName = studentName;
    }

    @Autowired
    public void setStudentCourse(@Value("Spring Framework") String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{studentName=" + studentName 
        + ", studentCourse=" + studentCourse + "}";
    }
}
