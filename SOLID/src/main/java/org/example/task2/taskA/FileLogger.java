package org.example.task2.taskA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(fileName,true))){
            writer.write(message);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
