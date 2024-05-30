package Factory.entities;

import Factory.Transport;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
    
}
