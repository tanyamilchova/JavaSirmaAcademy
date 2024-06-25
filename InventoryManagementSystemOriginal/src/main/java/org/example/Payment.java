package org.example;

import java.time.LocalDate;
import java.util.HashSet;

public class Payment {

    private long id;
    private static long unicId=1;
    private long userId;
    private LocalDate date;
    private double total;


    public Payment(long userId) {
        this.id=unicId++;
        this.userId = userId;
        this.date = LocalDate.now();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Payment:"+String.valueOf(this.id);
    }
}
