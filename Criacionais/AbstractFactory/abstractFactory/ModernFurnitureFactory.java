package AbstractFactory.abstractFactory;

import AbstractFactory.models.chair.Chair;
import AbstractFactory.models.chair.ModernChair;
import AbstractFactory.models.coffeTable.CoffeTable;
import AbstractFactory.models.coffeTable.ModernCoffeTable;
import AbstractFactory.models.sofa.ModernSofa;
import AbstractFactory.models.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactrory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable creatCoffeTabel() {
       return new ModernCoffeTable();
    }
    
}
