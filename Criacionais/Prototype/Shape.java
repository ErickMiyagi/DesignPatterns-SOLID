package Prototype;

public abstract class Shape {
    int X;
    int Y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }
    public abstract Shape clone();

}
