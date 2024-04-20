package Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaLazy {
    //Singleton Lazy
    public static AgendaLazy INSTANCE = null;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public AgendaLazy(){
        diasDisponiveis.put("Segunda", true);
        diasDisponiveis.put("Terça", true);
        diasDisponiveis.put("Quarta", true);
        diasDisponiveis.put("Quinta", true);
        diasDisponiveis.put("Sexta", true);
        diasDisponiveis.put("Sábado", true);
        diasDisponiveis.put("Domingo", true);
    }
    public static AgendaLazy getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaLazy();
            return INSTANCE;
        }
        return INSTANCE;
    }
    public Map<String, Boolean> getDias(){
        return diasDisponiveis;
    }
    public void ocupa(String dia){
        diasDisponiveis.put(dia, Boolean.FALSE);
    }
}
