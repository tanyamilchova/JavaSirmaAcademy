package org.example.task3;

public class DemoEngine {
    public static void main(String[] args) {

       Engine electric= EngineFactory.getEngine("electric");
       Engine diesel= EngineFactory.getEngine("diesel");
    }
}
