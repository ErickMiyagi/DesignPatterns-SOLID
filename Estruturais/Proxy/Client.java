package Estruturais.Proxy;

public class Client {
    public static void main(String[] args) {
        Service s = new Service();
        Proxy p = new Proxy(s);
        p.operation();
    }
}
