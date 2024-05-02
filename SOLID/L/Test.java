package SOLID.L;

public class Test {
    public static void main(String[] args) {
        Form f = new Rectangule(10, 10);
        System.out.println("Area de um retangulo: " + f.area());

        f = new Quadrado(20);
        System.out.println("Area de uma quadrado: " + f.area());
    }
}
