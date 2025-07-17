package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryApp {
// Main driver method
  public static void main(String[] args) 
  {
    // Creating object in a spring container (Beans)
    BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
    Student student = (Student) factory.getBean("student");

    System.out.println(student);
  }
}
