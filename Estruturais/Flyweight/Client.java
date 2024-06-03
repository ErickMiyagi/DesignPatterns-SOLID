package Estruturais.Flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Context c1 = new Context("StateA", "Unique1",flyweightFactory);
        Context c2 = new Context("StateB", "Unique2",flyweightFactory);
        Context c3 = new Context("StateC", "Unique3",flyweightFactory);

        c1.operation();
        c2.operation();
        c3.operation();

    }
}
