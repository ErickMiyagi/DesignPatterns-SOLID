package Estruturais.Proxy;

import java.time.LocalDate;

public class TestPessoa {
    public static void main(String[] args) {
        PessoaRepositoryProxy prs = new PessoaRepositoryProxy();
        PessoaService ps = new PessoaService(prs);

        Pessoa p = new PessoaBuilder()
                .lastName("M")
                .dataDeNascimento(LocalDate.of(1982, 1, 1))
                .name("A")
                .apelido("B")
                .document("1928312839")
                .build();
        ps.save(p);

        Pessoa retornaPessoa = ps.findId(1L);
        System.out.println(retornaPessoa);
    }
}
