package HeartBreakingLesson.OOP_Abstraction.AbstractClasses;

public abstract class Shape {
    String color;
    String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public abstract void showShapeArea();

    public abstract void showShapePerimeter();
}
