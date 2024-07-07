package org.example.task4.taskA;

public class ScanerFax implements ScanableMachine, FxableMachine {
    @Override
    public void fax() {
        System.out.println("Fax from ScannerFaxMachine");
    }

    @Override
    public void scan() {
        System.out.println("Scan from ScannerFaxMachine");
    }
}
