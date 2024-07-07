package org.example.task2.taskA;

public class LoggerFactory {
    public static Logger getLogger(String type, String fileName){
        switch (type.toLowerCase()){
            case "console"->{return new ConsoleLogger();}
            case "file"-> {
                return new FileLogger(fileName);
            }
            default -> throw new IllegalArgumentException("Unknown Logger:"+type);
        }
    }
}
