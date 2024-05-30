package Factory.logistics;

import Factory.Transport;
import Factory.entities.Ship;

public class SeaLogist extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
