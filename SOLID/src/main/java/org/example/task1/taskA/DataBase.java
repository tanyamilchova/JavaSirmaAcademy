package org.example.task1.taskA;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private final List<Book> books=new LinkedList<>();

    public void saveToDataBase(Book book){
        books.add(book);
    }
    public void printCollectionFromDataBase(){
        System.out.println(books);
    }
}
