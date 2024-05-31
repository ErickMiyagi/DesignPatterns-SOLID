package Builder;

public class HouseBuilder {

    boolean buildWalls;
    boolean buildDoors;
    boolean buildWindows;
    boolean buildRoof;
    boolean buildGarage;
    boolean buildSwimmingPool;
    boolean buildFancyStatues;

    public HouseBuilder()  {}

    public HouseBuilder buildWalls(){    
        this.buildWalls = true;
        return this;
    }   
    public HouseBuilder buildDoors(){    
        this.buildDoors = true;
        return this;
    }   
    public HouseBuilder buildWindows(){    
        this.buildWindows = true;
        return this;
    }   
    public HouseBuilder buildRoof(){    
        this.buildRoof = true;
        return this;
    }   
    public HouseBuilder buildGarage(){
        this.buildGarage = true;
        return this;
    }
    public HouseBuilder buildSwimmingPool(){
        this.buildSwimmingPool = true;
        return this;
    }
    public HouseBuilder buildFancyStatues(){
        this.buildFancyStatues = true;
        return this;
    }
    public House build() {
        return new House(this);
    }
}
