package Factory.logistics;

import Factory.Transport;
import Factory.entities.Truck;

public class RoadLogist extends Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
