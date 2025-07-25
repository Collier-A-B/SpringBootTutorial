package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.bean_lifecycle;

// uses interface approach
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// HelloWorld class which implements the
// interfaces
public class HelloWorldInterApproach
        implements InitializingBean,
        DisposableBean {

    @Override
    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    public void afterPropertiesSet()
            throws Exception {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }

    @Override
    // This method is invoked
    // just after the container
    // is closed
    public void destroy() throws Exception {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
