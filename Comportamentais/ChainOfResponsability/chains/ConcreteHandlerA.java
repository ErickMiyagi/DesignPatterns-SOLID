package Comportamentais.ChainOfResponsability.chains;

import Comportamentais.ChainOfResponsability.BaseHandler;

public class ConcreteHandlerA extends BaseHandler{
    
    @Override
    public void handler(String request){
        if(canHandle(request)){
            System.out.println("Handled by ConcreteHadnlerA");
        } else {
            super.handler(request);
        }
    }
    public boolean canHandle(String request){
        return request.equals("TypeA");
    }
}
