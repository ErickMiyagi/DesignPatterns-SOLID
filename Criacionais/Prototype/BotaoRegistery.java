package Prototype;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistery {
    
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static{
    Botao botaoAmarelo = new Botao();
    botaoAmarelo.setCore("Amarelo");
    botaoAmarelo.setAltura(25);
    botaoAmarelo.setLargura(120);
    botaoAmarelo.setTipoBotao(TipoBotao.TRACEJADA);

    Botao botaoAzul = new Botao();
    botaoAzul.setCore("Azul");  
    botaoAzul.setAltura(35);
    botaoAzul.setLargura(160);
    botaoAzul.setTipoBotao(TipoBotao.TRACEJADA);

    Botao botaoVermelho = new Botao();
    botaoVermelho.setCore("Vermelho"); 
    botaoVermelho.setAltura(55);
    botaoVermelho.setLargura(180);
    botaoVermelho.setTipoBotao(TipoBotao.TRACEJADA);

    REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
    REGISTRY.put("BOTAO_AZUL", botaoAzul);
    REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);

    }
    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }
}
