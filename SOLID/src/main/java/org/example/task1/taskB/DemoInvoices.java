package org.example.task1.taskB;

import java.time.LocalDateTime;

public class DemoInvoices {
    public static void main(String[] args) {
    DBInvoice dbInvoice=new DBInvoice();
    Invoice invoice1=new Invoice(52.45,"Mony1", LocalDateTime.now());
    Invoice invoice2=new Invoice(57.45,"Mony2", LocalDateTime.now());
    Invoice invoice3=new Invoice(599.45,"Mony3", LocalDateTime.now());
    Invoice invoice4=new Invoice(40.45,"Mony4", LocalDateTime.now());
    dbInvoice.saveInvoice(invoice1);
    dbInvoice.saveInvoice(invoice2);
    dbInvoice.saveInvoice(invoice3);
    dbInvoice.saveInvoice(invoice4);

    dbInvoice.printInvoices();
    }
}
