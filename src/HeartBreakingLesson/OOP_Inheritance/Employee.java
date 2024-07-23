package HeartBreakingLesson.OOP_Inheritance;

import HeartBreakingLesson.ClassesAndObjects.Person;

// the Person class come from ClassesAndObjects lesson
public class Employee extends Person {
    String jobTitle;

    public Employee(String name, int age, boolean gender, String jobTitle) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
    }

    public void workIntroduce() {
        System.out.println("I'm currently working as an " + this.jobTitle + ".");
    }
}
