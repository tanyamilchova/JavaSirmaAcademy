package org.example;

public class PayPalAccount implements PaymentAtribute{
    private String password;
    private String email;
    private String key;

    public PayPalAccount(String password, String email) {
        this.password = password;
        this.email = email;
        this.key=email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getKey() {
        return key;
    }
}
