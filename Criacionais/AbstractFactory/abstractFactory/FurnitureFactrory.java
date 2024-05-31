package AbstractFactory.abstractFactory;

import AbstractFactory.models.chair.Chair;
import AbstractFactory.models.coffeTable.CoffeTable;
import AbstractFactory.models.sofa.Sofa;

public interface FurnitureFactrory {
    Chair createChair();
    Sofa createSofa();
    CoffeTable creatCoffeTabel();
}
