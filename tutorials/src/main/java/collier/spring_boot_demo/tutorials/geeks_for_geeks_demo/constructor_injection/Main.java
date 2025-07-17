package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Load the Spring application context
        ApplicationContext context0 
        = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the Student bean
        Student student0 = context0.getBean("student", Student.class);

        // Call the cheating() method
        student0.cheating();

        // Load the Spring application context 
        // using annotation-based configuration
        ApplicationContext context1 
        = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Student bean
        Student student1 = context1.getBean(Student.class);

        // Call the cheating() method
        student1.cheating();
    }
}
