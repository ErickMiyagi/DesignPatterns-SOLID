package AbstractFactory;

import AbstractFactory.abstractFactory.FurnitureFactrory;
import AbstractFactory.models.chair.Chair;
import AbstractFactory.models.coffeTable.CoffeTable;
import AbstractFactory.models.sofa.Sofa;

public class Client {
    private Chair chair;
    private Sofa sofa;
    private CoffeTable coffeTable;

    public Client(FurnitureFactrory factrory){
        chair = factrory.createChair();
        sofa = factrory.createSofa();
        coffeTable = factrory.creatCoffeTabel();
    }
    public void useFurniture(){
        chair.hasLegs();
        chair.sitOn();
        coffeTable.putStuffOn();
        sofa.lieOn();
    }
}
