package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.application_context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student() {
        return new Student(1, "Geek");
    }
}
