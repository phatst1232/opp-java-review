package HeartBreakingLesson.OOP_Abstraction;

import HeartBreakingLesson.OOP_Abstraction.AbstractClasses.Shape;
import HeartBreakingLesson.OOP_Abstraction.Interfaces.MathematicalShape;

public class Circle extends Shape implements MathematicalShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, "circle");
        this.radius = radius;
    }

    @Override
    public void showShapeArea() {
        double area = Math.PI * this.radius * this.radius;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        System.out.println("Circle area = " + roundedArea);
    }

    @Override
    public void showShapePerimeter() {
        System.out.println("Circle perimeter = " + Math.round(this.radius * 2 * Math.PI * 100.0) / 100.0);
    }

    @Override
    public void showShapeInformation() {
        System.out.println("Circle's Radius = " + this.radius);
        this.showShapeArea();
        this.showShapePerimeter();
    }
}
