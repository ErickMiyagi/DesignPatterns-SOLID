package Estruturais.Proxy;

public class Service implements ServiceInterface{

    @Override
    public void operation() {
        System.out.println("Executing operation in Service.");
    }
    
}
