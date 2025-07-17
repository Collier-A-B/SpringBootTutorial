package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.constructor_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.constructor_injection")
public class AppConfig {
    @Bean
    public Student student(MathCheat mathCheat) {
        return new Student(101, mathCheat); // Provide the id value here
    }
}
