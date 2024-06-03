package Estruturais.Decorator;

public class BaseDecorator implements Notifier{

    protected Notifier wrapper;

    public BaseDecorator(Notifier wrapper){
        this.wrapper = wrapper;
    }

    @Override
    public void send(String message) {
      wrapper.send(message);
    }
    
}
