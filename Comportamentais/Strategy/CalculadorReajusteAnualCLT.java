package Comportamentais.Strategy;

import java.math.BigDecimal;

public class CalculadorReajusteAnualCLT implements CalculadorReajusteAnual{

    @Override
    public void calcularAjusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
    }
    
}
