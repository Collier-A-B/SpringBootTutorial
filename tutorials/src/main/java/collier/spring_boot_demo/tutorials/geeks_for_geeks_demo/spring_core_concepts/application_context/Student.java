package collier.spring_boot_demo.tutorials.geeks_for_geeks_demo.spring_core_concepts.application_context;

public class Student {
    // member variables
    private int id;
    private String name;

    // Constructor 1
    public Student() {
    }

    // Constructor 2
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method of this class
    // @Override
    public String toString() {

        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
