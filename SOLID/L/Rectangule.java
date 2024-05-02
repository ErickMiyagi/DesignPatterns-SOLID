package SOLID.L;

public class Rectangule extends Form{
    private double width;
    private double height;
    
    public Rectangule(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width * height;
    }
}
