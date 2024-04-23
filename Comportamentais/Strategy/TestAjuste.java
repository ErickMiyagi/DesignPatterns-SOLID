package Comportamentais.Strategy;

import java.math.BigDecimal;

public class TestAjuste {
    public static void main(String[] args) {
        ReajusteAnualStrategy reajusteAnual = new ReajusteAnualStrategy();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Vetor");
        funcionarioCLT.setTipoDeContrataçao(TipoDeContrataçao.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Vetor123");
        funcionarioPJ.setTipoDeContrataçao(TipoDeContrataçao.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Podolski");
        funcionarioEstagio.setTipoDeContrataçao(TipoDeContrataçao.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));

        reajusteAnual.calcularAjuste(funcionarioCLT, new CalculadorReajusteAnualCLT());
        reajusteAnual.calcularAjuste(funcionarioPJ, new CalculadorReajusteAnualPJ());
        reajusteAnual.calcularAjuste(funcionarioEstagio, new CalculadorReajusteAnualEstagio());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
