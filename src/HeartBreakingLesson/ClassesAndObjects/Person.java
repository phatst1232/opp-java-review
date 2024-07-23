package HeartBreakingLesson.ClassesAndObjects;

public class Person {
    String name;
    int age;
    boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("Hello everyone! My name is " + name + " and I am " + age + " years old.");
    }

    public void goForCoffee() {
        System.out.println("I am going for coffee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
