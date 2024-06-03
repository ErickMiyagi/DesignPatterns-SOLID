package Estruturais.Facade;

import Estruturais.Facade.model.StoreFacade;

public class Program {
    public static void main(String[] args) {
        String account = "Adam";
        String product = "Computer";
        Double price = 2500.00;
        StoreFacade store = new StoreFacade();

        store.buyProduct(product, price, account);

    }
}
