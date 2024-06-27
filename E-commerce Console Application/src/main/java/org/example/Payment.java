package org.example;

import java.time.LocalDate;

public abstract class Payment {
    public  enum Type{CREDIT_CARD,PAYPAL}
    protected  PaymentProssesor prossesor ;
    protected long id;
    protected static long unicId=1;
    protected long userId;
    protected LocalDate date;
    protected double total;
    protected Type type;

    protected String mapKey;


    public Payment(long userId, LocalDate date,  Type type,  String mapKey) {
        this.id=unicId++;
        this.userId = userId;
        this.date = date;
        this.type = type;
        this.mapKey = mapKey;
    }

    protected abstract boolean authorisePayment(Payment payment , User user);
    public void setProssesor(PaymentProssesor prossesor) {
        this.prossesor = prossesor;
    }

    public String getMapKey() {
        return mapKey;
    }

    public Type getType() {
        return type;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Payment:"+String.valueOf(this.id);
    }
}
