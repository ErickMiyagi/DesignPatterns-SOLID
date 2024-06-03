package Estruturais.Proxy;

public class Proxy implements ServiceInterface{

    private Service service;

    public Proxy(Service s){
        this.service = s;
    }
    private boolean checkAcess(){
        System.out.println("Checking access in Proxy.");
        return true;
    }
    @Override
    public void operation() {
        if(checkAcess()){
            service.operation();
        }
    }
    
}
