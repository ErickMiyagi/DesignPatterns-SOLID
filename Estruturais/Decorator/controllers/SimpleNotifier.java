package Estruturais.Decorator.controllers;

import Estruturais.Decorator.models.Notifier;

public class SimpleNotifier implements Notifier{

    @Override
    public void send(String message) {
       System.out.println("Sending a message: " + message);
    }
    
}
