package Singleton;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    //Singleton Eager
    public static final Agenda INSTANCE = new Agenda();
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public Agenda(){
        diasDisponiveis.put("Segunda", true);
        diasDisponiveis.put("Terça", true);
        diasDisponiveis.put("Quarta", true);
        diasDisponiveis.put("Quinta", true);
        diasDisponiveis.put("Sexta", true);
        diasDisponiveis.put("Sábado", true);
        diasDisponiveis.put("Domingo", true);
    }
    public static Agenda getInstance(){
        return INSTANCE;
    }
    public Map<String, Boolean> getDias(){
        return diasDisponiveis;
    }
    public void ocupa(String dia){
        diasDisponiveis.put(dia, Boolean.FALSE);
    }
}