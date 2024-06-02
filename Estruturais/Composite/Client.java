package Estruturais.Composite;

public class Client {
    public static void main(String[] args) {
        Component l1 = new Leaf();
        Component l2 = new Leaf();

        Composite c1 = new Composite();
        c1.add(l1);
        c1.add(l2);

        Composite c2 = new Composite();
        c2.add(c1);

        c2.execute();
    }
}
