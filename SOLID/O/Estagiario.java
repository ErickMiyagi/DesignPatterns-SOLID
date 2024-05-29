package SOLID.O;

public class Estagiario implements Renumeracao{
    private double saldo;

    public Estagiario(double saldo){
        this.saldo = saldo;
    }
    @Override
    public double renumeravel() {
       return saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
}
