package Estruturais.Decorator.controllers;

import Estruturais.Decorator.models.Notifier;

public class FacebookDecorator extends BaseDecorator{

    public FacebookDecorator(Notifier wrapper) {
        super(wrapper);
    }
    @Override
    public void send(String message){
        super.send(message);
        sendFacebook(message);

    }
    public void sendFacebook(String message){
        System.out.println("Facebook message: " + message);
    }
    
}
