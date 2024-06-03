package Estruturais.Facade.model;

import Estruturais.Facade.service.Invetory;
import Estruturais.Facade.service.OrderProcessing;
import Estruturais.Facade.service.Payment;
import Estruturais.Facade.service.Shipping;

public class StoreFacade {
    private OrderProcessing orderProcessing;
    private Invetory invetory;
    private Payment payment;
    private Shipping shipProduct;

    public StoreFacade() {
        this.orderProcessing = new OrderProcessing();
        this.invetory = new Invetory();
        this.payment = new Payment();
        this.shipProduct = new Shipping();
    }

    public void buyProduct(String product, double amount, String account){
        if(invetory.checkStock(product)){
            orderProcessing.process(product);
            payment.payment(account, amount);
            shipProduct.shipProduct(product);
            System.out.println("Product purchased successfully!");
        } else {
            System.out.println("Product out stock!");
        }
    }
    
}
