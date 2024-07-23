package HeartBreakingLesson.OOP_Polymorphism_OverridingOverloading;

import HeartBreakingLesson.ClassesAndObjects.Person;

public class PolymorphismEmployee extends Person {
    public PolymorphismEmployee(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override // Yeah... This method override Person's goForCoffee() method.
    public void goForCoffee() {
        System.out.println("I am going for coffee with my Macbook as always...");
    }

    public void goForCoffee(String[] friends) {
        String strFriends = String.join(", ", friends);
        System.out.println("I am going for coffee with " + strFriends + " and my Macbook.");
    }
}
