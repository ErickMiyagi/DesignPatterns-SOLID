package SOLID.O;

public class ContratoPJ implements Renumeracao{

    private double saldo;

    public ContratoPJ(double saldo){
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
