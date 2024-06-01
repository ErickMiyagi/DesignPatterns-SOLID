package Estruturais.Adapter;

public class Program {
    public static void main(String[] args) {
        Service service = new Service();

        Adapter adapter = new Adapter(service);
        
        Client client = new Client(adapter);

        client.doWork("Hello Adapter");
    }    
}
