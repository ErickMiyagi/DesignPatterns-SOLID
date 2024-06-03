package Estruturais.Decorator;

public class SlackDecorator extends BaseDecorator{

    public SlackDecorator(Notifier wrapper) {
        super(wrapper);
    }
    @Override
    public void send(String message){
        super.send(message);
        sendSlack(message);

    }
    public void sendSlack(String message){
        System.out.println("Slack message: " + message);
    }
}
