package Estruturais.Decorator;

public class Program {
    public static void main(String[] args) {
        Notifier notifier = new SimpleNotifier();
        Notifier notifierSMS = new SMSDecorator(notifier);
        Notifier notifierFacebook = new FacebookDecorator(notifierSMS);
        Notifier notifierSlack = new SlackDecorator(notifierFacebook);

        notifierSlack.send("Hello");
    }
}
