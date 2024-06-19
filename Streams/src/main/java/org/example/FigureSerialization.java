package org.example;

import java.io.*;

public class FigureSerialization implements Serializable {
    String color;
    double width;
    double height;
    double depth;

    public FigureSerialization(String color, double width, double heigth, double depth) {
        this.color = color;
        this.width = width;
        this.height = heigth;
        this.depth = depth;
    }

    public static void main(String[] args) {
        FigureSerialization figure=new FigureSerialization("red",2,3,4);
        String path="D:\\Sirma\\Streams\\src\\serializableFile.txt";
        try (FileOutputStream fos=new FileOutputStream(path);
             ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(figure);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis)
        ){
            FigureSerialization fig=(FigureSerialization) ois.readObject();
            System.out.println("color :"+fig.color);
            System.out.println("width :"+fig.width);
            System.out.println("height :"+fig.height);
            System.out.println("depth :"+fig.depth);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
