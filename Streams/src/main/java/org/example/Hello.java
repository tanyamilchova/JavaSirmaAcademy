package org.example;

import java.io.*;

public class Hello {
    public static void main(String[] args) {
//        String path="D:\\Sirma\\Streams\\src\\input.txt";
        String path="D:\\Sirma\\Streams\\src\\Hello.txt.txt";
        File file=new File(path);
        try(
            FileWriter fr=new FileWriter(path,true);
            BufferedWriter bw=new BufferedWriter(fr);
        ){
            if(file.exists()){
                file.createNewFile();
            }
            bw.write("First row");

            InputStream in=new FileInputStream(path);
//            int oneByte=in.read();
//            while (oneByte>=0){
//                System.out.printf("%s", Integer.toBinaryString(oneByte));
//    //            System.out.printf("%s", (char)oneByte);
//                oneByte=in.read();
//            }
            byte oneByte=(byte) in.read();
            while (oneByte>=0){
                System.out.printf("%s", Integer.toBinaryString(oneByte));
                //            System.out.printf("%s", (char)oneByte);
                oneByte=(byte) in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
