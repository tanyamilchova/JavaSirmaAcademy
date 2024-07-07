package org.example.task1.taskA;

import org.example.task1.taskA.Book;
import org.example.task1.taskA.DataBase;

public class DemoBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        DataBase dataBase=new DataBase();
        dataBase.saveToDataBase(book1);
        dataBase.saveToDataBase(book2);
        dataBase.printCollectionFromDataBase();

    }
}
