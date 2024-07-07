package org.example.task1.taskB;

import java.util.LinkedList;
import java.util.List;

public class DBInvoice {
    private final List<Invoice> invoices=new LinkedList<>();

    public void saveInvoice(Invoice invoice){
        this.invoices.add(invoice);
    }
    public void printInvoices(){
        System.out.println(this.invoices);
    }
}
