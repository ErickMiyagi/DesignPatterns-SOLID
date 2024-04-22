package Prototype;

public class Botao {
    protected String core;
    protected int largura;
    protected int altura;
    protected TipoBotao tipoBotao;
    
    public String getCore() {
        return core;
    }
    public void setCore(String core) {
        this.core = core;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public TipoBotao getTipoBotao() {
        return tipoBotao;
    }
    public void setTipoBotao(TipoBotao tipoBotao) {
        this.tipoBotao = tipoBotao;
    }
    @Override
    public String toString() {
        return "Botao [core=" + core + ", largura=" + largura + ", altura=" + altura + ", tipoBotao=" + tipoBotao + "]";
    }
    
}
