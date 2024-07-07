package org.example.task3;

public class EngineFactory {
    public static Engine getEngine(String type){
        switch (type){
            case "diesel"-> {
                return new DieselEngine();
            }
            case "electric"-> {
                return new ElectricEngine();
            }
            default -> throw  new IllegalArgumentException("Unknown engine type: "+type);
        }
    }
}
