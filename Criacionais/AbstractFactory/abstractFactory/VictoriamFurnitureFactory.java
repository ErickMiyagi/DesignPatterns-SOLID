package AbstractFactory.abstractFactory;

import AbstractFactory.models.chair.Chair;
import AbstractFactory.models.chair.VictoriamChair;
import AbstractFactory.models.coffeTable.CoffeTable;
import AbstractFactory.models.coffeTable.VictoriamCoffeTable;
import AbstractFactory.models.sofa.Sofa;
import AbstractFactory.models.sofa.VictoriamSofa;

public class VictoriamFurnitureFactory implements FurnitureFactrory{

    @Override
    public Chair createChair() {
        return new VictoriamChair();
    }

    @Override
    public Sofa createSofa() {
       return new VictoriamSofa();
    }

    @Override
    public CoffeTable creatCoffeTabel() {
        return new VictoriamCoffeTable();
    }
    
}
