package Estruturais.Decorator;

public class SimpleNotifier implements Notifier{

    @Override
    public void send(String message) {
       System.out.println("Sending a message: " + message);
    }
    
}
