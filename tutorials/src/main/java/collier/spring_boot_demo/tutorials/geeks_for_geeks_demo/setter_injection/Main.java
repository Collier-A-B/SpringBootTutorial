package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        // Load the Spring configuration file
        ApplicationContext context0 
        = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the bean from the Spring container
        Student student0 = (Student) context0.getBean("stud");

        // Print the student details
        System.out.println(student0);

        
        
        // Load the Spring application context using annotation-based configuration
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Student bean
        Student student1 = context1.getBean(Student.class);

        // Print the student details
        System.out.println(student1);
    }
}