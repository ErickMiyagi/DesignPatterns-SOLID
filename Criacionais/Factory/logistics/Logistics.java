package Factory.logistics;

import Factory.Transport;

public abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

}
