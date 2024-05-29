package SOLID.O;

public class FolhaDePagamento {
    protected double saldo;

    public void calcular(Renumeracao funcionario){
        this.saldo = funcionario.renumeravel();
    }
}
