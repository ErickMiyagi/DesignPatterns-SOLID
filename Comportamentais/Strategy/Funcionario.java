package Comportamentais.Strategy;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private TipoDeContrataçao tipoDeContrataçao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public TipoDeContrataçao getTipoDeContrataçao() {
        return tipoDeContrataçao;
    }
    public void setTipoDeContrataçao(TipoDeContrataçao tipoDeContrataçao) {
        this.tipoDeContrataçao = tipoDeContrataçao;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", tipoDeContrataçao=" + tipoDeContrataçao + "]";
    }
    
}
