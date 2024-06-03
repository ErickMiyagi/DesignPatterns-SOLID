package Estruturais.Flyweight;

public class Context{
    private String uniqueState;
    private Flyweight flyweight;

    public Context(String repeatingState, String uniqueState, FlyweightFactory factory){
        this.uniqueState = uniqueState;
        this.flyweight = factory.getFlyweight(repeatingState);

    }
    public void operation() {
        flyweight.operation(uniqueState);
    }

}
