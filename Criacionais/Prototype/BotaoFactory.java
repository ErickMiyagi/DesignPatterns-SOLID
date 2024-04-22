package Prototype;

public class BotaoFactory {
    public static Botao getInstance(Botao prototype){
        Botao clone = new Botao();
        clone.setCore(prototype.getCore());
        clone.setAltura(prototype.getAltura());
        clone.setLargura(prototype.getLargura());
        clone.setTipoBotao(prototype.getTipoBotao());
        
        return clone;
    }
}
