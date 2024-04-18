package Builder;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(
            "Jonnhy", 
            "Fellas", 
            "12381238", 
            "jonnhy@hotmail.com", 
            "Jonnhy",
            LocalDate.of(1985, 12, 12));
        System.out.println(p);

        Pessoa pessoa = new PessoaBuilder()
            .lastName("Dimitri")
            .dataDeNascimento(LocalDate.of(1982, 12, 12))
            .document("90129282")
            .email("Dimitry@hotmail.com")
            .apelido("Dimitri")
            .name("Mister")
            .build();

        System.out.println(pessoa);

    }
}
