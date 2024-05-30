package Factory.entities;

import Factory.Transport;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver by land");
    }
    
}
