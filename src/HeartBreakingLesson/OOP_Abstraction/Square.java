package HeartBreakingLesson.OOP_Abstraction;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void showShapeArea() {
        System.out.println("Square area: " + Math.round(side * side * 100.0) / 100.0);
    }
}
