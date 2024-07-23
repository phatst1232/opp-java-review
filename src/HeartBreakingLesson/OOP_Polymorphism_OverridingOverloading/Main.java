package HeartBreakingLesson.OOP_Polymorphism_OverridingOverloading;

import HeartBreakingLesson.ClassesAndObjects.Person;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 25, true);
        // This 👇 is Super goForCoffee() function belong to Person class
        john.goForCoffee();

        PolymorphismEmployee itPhat = new PolymorphismEmployee("Huynh Tan Phat", 24, true);
        // Look!!! 👇 PolymorphismEmployee.goForCoffee() OVERRDING Person.goForCoffee()
        itPhat.goForCoffee();
        String[] phatFriends = {"John", "Lena"};
        // Look!!! 👇 goForCoffee() and goForCoffee(String[]) methods are overloading
        itPhat.goForCoffee(phatFriends);
    }
}
