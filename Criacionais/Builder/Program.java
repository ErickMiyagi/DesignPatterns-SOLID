package Builder;

public class Program {
    public static void main(String[] args) {
        House houseWithGarage = new HouseBuilder()
        .buildDoors()
        .buildWalls()
        .buildRoof()
        .buildWindows()
        .buildGarage()
        .build();

        House houseWithSwimmingPool = new HouseBuilder()
        .buildDoors()
        .buildWalls()
        .buildRoof()
        .buildWindows()
        .buildGarage()
        .buildSwimmingPool()
        .build();

        House houseWithFancyStatues = new HouseBuilder()
        .buildDoors()
        .buildWalls()
        .buildRoof()
        .buildWindows()
        .buildGarage()
        .buildFancyStatues()
        .build();

        System.out.println(houseWithGarage);
        System.out.println(houseWithSwimmingPool);
        System.out.println(houseWithFancyStatues);    
    }

}
