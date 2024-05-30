package Factory;

import Factory.logistics.Logistics;
import Factory.logistics.RoadLogist;
import Factory.logistics.SeaLogist;

public class Program {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogist();
        Logistics shipLogistics = new SeaLogist();

        roadLogistics.planDelivery();
        shipLogistics.planDelivery();
    }
}
