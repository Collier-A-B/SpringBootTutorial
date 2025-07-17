package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// uses annotation approach
public class HelloWorldAnnotation {
    // Annotate this method to execute it
	// automatically as the bean is
	// instantiated
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println(
			"Bean HelloWorld has been "
			+ "instantiated and I'm the "
			+ "init() method");
	}

	// Annotate this method to execute it
	// when Spring container is closed
	@PreDestroy
	public void destroy() throws Exception
	{
		System.out.println(
			"Container has been closed "
			+ "and I'm the destroy() method");
	}
}
