package Estruturais.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> cache = new HashMap<>();

    public Flyweight getFlyweight(String repeatingState){
        if(!cache.containsKey(repeatingState)){
            cache.put(repeatingState, new ConcreteFlyweight(repeatingState));
        }
        return cache.get(repeatingState);
    }
}
