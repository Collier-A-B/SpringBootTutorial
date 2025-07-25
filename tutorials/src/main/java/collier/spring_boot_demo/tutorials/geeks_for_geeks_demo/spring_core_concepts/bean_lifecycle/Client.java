package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.bean_lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws Exception {
        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");

        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();
    }
}