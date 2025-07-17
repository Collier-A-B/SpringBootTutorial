package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.bean_lifecycle;
// uses xml configuration
public class HelloWorld {
    // Custom init method
    public void init() throws Exception {
        System.out.println("Bean HelloWorld has been instantiated, and I'm the init() method");
    }

    // Custom destroy method
    public void destroy() throws Exception {
        System.out.println("Container has been closed, and I'm the destroy() method");
    }
}
