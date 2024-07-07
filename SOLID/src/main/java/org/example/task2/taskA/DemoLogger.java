package org.example.task2.taskA;

public class DemoLogger {
    public static void main(String[] args) {
        Logger consoleLogger= LoggerFactory.getLogger("console",null);
        consoleLogger.log("Message from the console logger");

        Logger fileLogger=LoggerFactory.getLogger("file","log.txt");
        fileLogger.log("FileLogger message");
    }
}
