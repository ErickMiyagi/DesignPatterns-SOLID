package Estruturais.Proxy;

public class PessoaService {
    private PessoaRepositoryProxy pessoaRepository;

    public PessoaService(PessoaRepositoryProxy pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    public void save(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }
    public Pessoa findId(Long id){
        return pessoaRepository.findById(id);
    }
}
