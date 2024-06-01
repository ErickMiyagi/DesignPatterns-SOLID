package Estruturais.Adapter;

public class Client {
    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void doWork(String data){
        clientInterface.method(data);
    }
    
}
