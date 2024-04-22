package Estruturais.Proxy;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {
    
    private Map<Long, Pessoa> banco = new HashMap<>();
    private static Long countId = 1L;
    public Pessoa findById(Long id) {
       try{
        Thread.sleep(3000);
       } catch(InterruptedException e){
        throw new RuntimeException(e);
       }
       return banco.get(id);
    }
    public void save(Pessoa pessoa) {
        banco.put(countId++, pessoa);
    }

    
}
