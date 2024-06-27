package org.example;

import java.time.LocalDate;

public class CreditCard  implements PaymentAtribute{
    private long id;
    private final String cardNumber;

    private String cardHolder;
    private LocalDate expDate;
    private String svvCode;
    private String key;

    public CreditCard(String cardNumber, String cardHolder, LocalDate expDate, String svvCode) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expDate = expDate;
        this.svvCode = svvCode;
        this.key=cardNumber;
    }

    public String getSvvCode() {
        return svvCode;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getKey() {
        return key;
    }
}
