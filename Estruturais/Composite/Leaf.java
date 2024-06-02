package Estruturais.Composite;

public class Leaf implements Component{

    @Override
    public void execute() {
        System.out.println("Leaf is doing some work.");
    }
    
}
