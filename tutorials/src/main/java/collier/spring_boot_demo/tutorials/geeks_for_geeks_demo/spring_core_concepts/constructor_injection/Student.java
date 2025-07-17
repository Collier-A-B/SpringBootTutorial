package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    // Class data members
    private int id;
    private MathCheat mathCheat;

    // Constructor for Dependency Injection
    @Autowired
    public Student(int id, MathCheat mathCheat) {
        this.id = id;
        this.mathCheat = mathCheat;
    }

    // Method to demonstrate functionality
    public void cheating() {
        System.out.println("My ID is: " + id);
        mathCheat.mathCheating();
    }
}
