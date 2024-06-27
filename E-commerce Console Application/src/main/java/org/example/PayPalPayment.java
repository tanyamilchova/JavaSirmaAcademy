package org.example;

import java.time.LocalDate;

public class PayPalPayment extends Payment{

   private long id;
   private String email;
   private String password;

    public PayPalPayment(long userId, LocalDate date, Type type,  String email, String password) {
        super(userId, date, type, email);
        this.email = email;
        this.password = password;
        this.mapKey=email;
    }

    @Override
    protected boolean authorisePayment(Payment payment,User user) {
            if(payment==null && user==null){
                System.out.println("Wrong data");
                return false;
            }
            Payment.Type type=payment.getType();
            if( type.equals(Payment.Type.PAYPAL) && prossesor.accountMap !=null){
                String key=user.getPayPalAccount().getEmail();
                if(prossesor.accountMap.containsKey(key)){

                    if(prossesor.accountMap.get(key).getEmail().equals(user.getPayPalAccount().getEmail()) &&
                            prossesor.accountMap.get(key).getPassword().equals(user.getPayPalAccount().getPassword()) ){
                        return true;
                    }
                }
            }
            return false;
        }
}

