package HeartBreakingLesson.OOP_Abstraction;

import HeartBreakingLesson.OOP_Abstraction.AbstractClasses.Shape;
import HeartBreakingLesson.OOP_Abstraction.Interfaces.MathematicalShape;

public class Square extends Shape implements MathematicalShape {
    double side;

    public Square(String color, double side) {
        super(color, "square");
        this.side = side;
    }

    @Override
    public void showShapeArea() {
        System.out.println("Square area: " + Math.round(side * side * 100.0) / 100.0);
    }

    @Override
    public void showShapePerimeter() {
        System.out.println("Square perimeter: " + Math.round(((side + side) * 2) * 100.0) / 100.0);
    }

    @Override
    public void showShapeInformation() {
        System.out.println("Square side:" + Math.round(side * 100.0) / 100.0);
        this.showShapeArea();
        this.showShapePerimeter();
    }
}
