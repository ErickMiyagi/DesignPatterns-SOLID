package Estruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> children = new ArrayList<>();

    public void add(Component c){
        children.add(c);
    }
    public void remove(Component c){
        children.remove(c);
    }
    public List<Component> getChildren(){
        return children;
    }
    @Override
    public void execute() {
        for(Component child : children){
            child.execute();
        }
    }

}
