package HeartBreakingLesson.OOP_Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nThere are implemented functions of the Abstract class - Shape");
        Circle circle = new Circle("white", 3);
        circle.showShapeArea();

        Square square = new Square("black", 3);
        square.showShapeArea();
        // Note that both Square and Circle were extended from Abstract class Shape!


        System.out.println("\nThere are implemented functions of the MathematicalShape interface");
        circle.showShapeInformation();
        System.out.println("===========================");
        square.showShapeInformation();

    }
}
