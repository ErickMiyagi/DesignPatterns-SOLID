package Prototype;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.X = 10;
        rectangle.Y = 20;
        rectangle.color = "Red";
        rectangle.width = 100;
        rectangle.height = 200;

        Rectangle clonedRectangle = (Rectangle) rectangle.clone();

        System.out.println("Cloned Rectangle:");
        System.out.println("X: " + clonedRectangle.X);
        System.out.println("Y: " + clonedRectangle.Y);
        System.out.println("Color: " + clonedRectangle.color);
        System.out.println("Width: " + clonedRectangle.width);
        System.out.println("Height: " + clonedRectangle.height);

    }
}
