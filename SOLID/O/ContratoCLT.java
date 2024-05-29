package SOLID.O;

public class ContratoCLT implements Renumeracao{
    private double saldo;

    public ContratoCLT(double saldo){
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
