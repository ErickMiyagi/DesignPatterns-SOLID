package Estruturais.Proxy;

import java.time.LocalDate;

public class Pessoa {
    
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String apelido;
    private LocalDate dataDeNascimento;
    
    public Pessoa(){

    }
    public Pessoa(String name, String lastName, String document, String email, String apelido,
            LocalDate dataDeNascimento) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    @Override
    public String toString() {
        return "Pessoa [name=" + name + ", lastName=" + lastName + ", document=" + document + ", email=" + email
                + ", apelido=" + apelido + ", dataDeNascimento=" + dataDeNascimento + "]";
    }

}
