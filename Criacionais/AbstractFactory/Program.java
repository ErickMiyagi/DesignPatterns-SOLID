package AbstractFactory;

import AbstractFactory.abstractFactory.FurnitureFactrory;
import AbstractFactory.abstractFactory.ModernFurnitureFactory;
import AbstractFactory.abstractFactory.VictoriamFurnitureFactory;

public class Program {
    public static void main(String[] args) {
        FurnitureFactrory factoryVictoriam = new VictoriamFurnitureFactory();
        Client victoriamClient = new Client(factoryVictoriam);

        System.out.println();
        System.out.println("Vicotriam Client: \n");
        victoriamClient.useFurniture();

        FurnitureFactrory factoryModern = new ModernFurnitureFactory();
        Client modernClient = new Client(factoryModern);
        
        System.out.println();
        System.out.println("Modern Client: \n");
        modernClient.useFurniture();
    }
}
