package Prototype;

public class TestBotao {
    public static void main(String[] args) {
        Botao botao = BotaoRegistery.getBotao("BOTAO_AMARELO");
        Botao botao1 = BotaoRegistery.getBotao("BOTAO_AZUL");
        Botao botao2 = BotaoRegistery.getBotao("BOTAO_VERMELHO");

        System.out.println(botao);
        System.out.println(botao1);
        System.out.println(botao2);
    }    
}
