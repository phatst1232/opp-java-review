package HeartBreakingLesson.OOP_Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.showShapeArea();

        Square square = new Square(4);
        square.showShapeArea();

        // Note that both Square and Circle were extended from Abstract class Shape!
    }
}
