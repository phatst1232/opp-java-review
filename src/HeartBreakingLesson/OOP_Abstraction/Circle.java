package HeartBreakingLesson.OOP_Abstraction;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void showShapeArea() {
        double area = Math.PI * this.radius * this.radius;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        System.out.println("Circle area = " + roundedArea);
    }
}
