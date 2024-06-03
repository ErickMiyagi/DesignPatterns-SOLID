package Estruturais.Decorator;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier wrapper) {
        super(wrapper);
    }
    
    @Override
    public void send(String message) {
      wrapper.send(message);
      sendSMS(message);
    }
    public void sendSMS(String message){
        System.out.println("SMS Message: " + message);
    }
    
}
