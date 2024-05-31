package AbstractFactory.models.chair;

public class ModernChair implements Chair{

    @Override
    public void hasLegs() {
        System.out.println("Modern Chain has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }
    
}
