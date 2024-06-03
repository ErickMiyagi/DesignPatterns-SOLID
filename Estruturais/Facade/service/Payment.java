package Estruturais.Facade.service;

public class Payment {
    public void payment(String account, double price){
        System.out.println("Making a payment $" + price + " from account " + account);
    }
}
