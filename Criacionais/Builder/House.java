package Builder;

public class House {
    
    private boolean buildWalls;
    private boolean buildDoors;
    private boolean buildWindows;
    private boolean buildRoof;
    private boolean buildGarage;
    private boolean buildSwimmingPool;
    private boolean buildFancyStatues;

    House(HouseBuilder builder){
        this.buildWalls = builder.buildWalls;
        this.buildDoors = builder.buildDoors;
        this.buildWindows = builder.buildWindows;
        this.buildRoof = builder.buildRoof;
        this.buildGarage = builder.buildGarage;
        this.buildSwimmingPool = builder.buildSwimmingPool;
        this.buildFancyStatues = builder.buildFancyStatues;
    }

    @Override
    public String toString() {
        return "House [buildWalls=" + buildWalls + ", buildDoors=" + buildDoors + ", buildWindows=" + buildWindows
                + ", buildRoof=" + buildRoof + ", buildGarage=" + buildGarage + ", buildSwimmingPool="
                + buildSwimmingPool + ", buildFancyStatues=" + buildFancyStatues + "]";
    }
    
}
