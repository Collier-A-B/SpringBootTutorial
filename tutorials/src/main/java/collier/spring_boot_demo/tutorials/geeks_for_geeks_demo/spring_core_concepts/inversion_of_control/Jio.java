package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.inversion_of_control;

import org.springframework.stereotype.Component;

@Component("jioBean")
public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Jio Calling");
    }

    @Override
    public void data() {
        System.out.println("Jio Data");
    }
}
