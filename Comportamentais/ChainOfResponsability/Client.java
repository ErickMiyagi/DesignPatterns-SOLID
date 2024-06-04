package Comportamentais.ChainOfResponsability;

import Comportamentais.ChainOfResponsability.chains.ConcreteHandlerA;
import Comportamentais.ChainOfResponsability.chains.ConcreteHandlerB;
import Comportamentais.ChainOfResponsability.chains.ConcreteHandlerC;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setNext(h2);
        h2.setNext(h3);

        h1.handler("TypeA");
        h2.handler("TypeB");
        h3.handler("TypeD");    

    }
}
