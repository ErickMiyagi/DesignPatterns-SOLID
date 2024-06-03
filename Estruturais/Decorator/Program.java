package Estruturais.Decorator;

import Estruturais.Decorator.controllers.FacebookDecorator;
import Estruturais.Decorator.controllers.SMSDecorator;
import Estruturais.Decorator.controllers.SimpleNotifier;
import Estruturais.Decorator.controllers.SlackDecorator;
import Estruturais.Decorator.models.Notifier;

public class Program {
    public static void main(String[] args) {
        Notifier notifier = new SimpleNotifier();
        Notifier notifierSMS = new SMSDecorator(notifier);
        Notifier notifierFacebook = new FacebookDecorator(notifierSMS);
        Notifier notifierSlack = new SlackDecorator(notifierFacebook);

        notifierSlack.send("Hello");
    }
}
