package Estruturais.Proxy;

import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    @Override
    public void save(Pessoa pessoa){
        log.info("Iniciando chamada do metodo save...");
        super.save(pessoa);
        log.info("Finalizando chamada...");    
    }
    
    @Override
    public Pessoa findById(Long id){
        log.info("Iniciando chamada do metodo save...");
        Pessoa p = super.findById(id);
        log.info("Finalizando chamada...");    
        return p;
    }
    
}
