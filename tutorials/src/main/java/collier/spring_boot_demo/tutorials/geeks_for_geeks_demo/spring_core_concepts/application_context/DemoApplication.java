package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.application_context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Student student = context.getBean(Student.class);

        // Print and display
        System.out.println(student);
    }
}
