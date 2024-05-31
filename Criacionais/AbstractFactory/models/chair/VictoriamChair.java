package AbstractFactory.models.chair;

public class VictoriamChair implements Chair{

    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair.");
    }
    
}
