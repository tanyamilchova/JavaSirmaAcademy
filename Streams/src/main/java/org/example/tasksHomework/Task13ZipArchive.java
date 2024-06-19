package org.example.tasksHomework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Task13ZipArchive {
    public static void main(String[] args) {
        String path="D:\\Sirma\\Streams\\src\\ZipArchive.zip";
        String output="D:\\Sirma\\Streams\\src\\Task13ExtractedFiles.txt";
        String archivedFile="D:\\Sirma\\Streams\\src\\Task13Archived.zip";
        try (ZipInputStream zis=new ZipInputStream(new FileInputStream(path));
             FileOutputStream fos=new FileOutputStream(output);
             ZipOutputStream zos=new ZipOutputStream(fos)){
            ZipEntry zipEntry;
            while ((zipEntry=zis.getNextEntry())!=null){
                if(zipEntry.getName().endsWith(".txt")){
                    zos.putNextEntry(new ZipEntry(zipEntry.getName()));
                    byte[]buffer=new byte[1024];
                    int len;
                    while((len=zis.read(buffer))>0){
                        zos.write(buffer,0,len);
                    }
                    zis.closeEntry();
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        try (ZipInputStream zis=new ZipInputStream(new FileInputStream(output));
             FileOutputStream fos=new FileOutputStream(archivedFile);
             ZipOutputStream zos=new ZipOutputStream(fos)){
            ZipEntry zipEntry;
            while ((zipEntry=zis.getNextEntry())!=null){
                if(zipEntry.getName().endsWith(".txt")){
                    zos.putNextEntry(new ZipEntry(zipEntry.getName()));
                    byte[]buffer=new byte[1024];
                    int len;
                    while((len=zis.read(buffer))>0){
                        zos.write(buffer,0,len);
                    }
                    zis.closeEntry();
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
