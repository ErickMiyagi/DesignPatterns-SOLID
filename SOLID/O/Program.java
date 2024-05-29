package SOLID.O;

public class Program {
    public static void main(String[] args) {
        ContratoCLT clt = new ContratoCLT(3000);
        ContratoPJ pj = new ContratoPJ(9000);
        Estagiario e = new Estagiario(1500);
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.calcular(clt);
        folha.calcular(pj);
        folha.calcular(e);

        System.out.println("Salario de CLT: " + clt.getSaldo());
        System.out.println("Salario de PJ: " + pj.getSaldo());
        System.out.println("Salario de Estagiario: " + e.getSaldo());
    }
}
