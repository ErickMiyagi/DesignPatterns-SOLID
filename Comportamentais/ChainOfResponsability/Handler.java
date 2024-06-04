package Comportamentais.ChainOfResponsability;

public interface Handler {
    void setNext(Handler h);
    void handler(String request);
}
