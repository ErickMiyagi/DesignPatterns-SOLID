package Estruturais.Flyweight;

public class ConcreteFlyweight implements Flyweight{

    private String repeatingState;

    public ConcreteFlyweight(String repeatingState){
        this.repeatingState = repeatingState;
    }
    @Override
    public void operation(String uniqueState) {
        System.out.println("Flyweight with repeating state: " + repeatingState + 
        " and unique state: " + uniqueState);
    }

}
