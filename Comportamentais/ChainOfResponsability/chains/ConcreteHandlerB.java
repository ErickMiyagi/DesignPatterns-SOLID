package Comportamentais.ChainOfResponsability.chains;

import Comportamentais.ChainOfResponsability.BaseHandler;

public class ConcreteHandlerB extends BaseHandler{
    
    @Override
    public void handler(String request){
        if(canHandle(request)){
            System.out.println("Handled by ConcreteHandlingB");
        } else {
            super.handler(request);
        }
    }
    public boolean canHandle(String request){
        return request.equals("TypeB");
    }
}
