package Estruturais.Proxy;
import java.time.LocalDate;

public class PessoaBuilder {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String apelido;
    private LocalDate dataDeNascimento;

    public PessoaBuilder name(String name) {
        this.name = name;
        return this;
    }
    public PessoaBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public PessoaBuilder document(String document) {
        this.document = document;
        return this;
    }
    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }
    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }
    public PessoaBuilder dataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
        return this;
    }
    public Pessoa build(){
        return new Pessoa(name, lastName, document, email, apelido, dataDeNascimento);
    }
    
}
