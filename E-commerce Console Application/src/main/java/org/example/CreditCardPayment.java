package org.example;

import java.time.LocalDate;

public class CreditCardPayment extends Payment{

    private String cardNumber;
   private String cvvCode;
    private LocalDate expDate;

    public CreditCardPayment(long userId, LocalDate date, Type type,  String cardNumber, String cvvCode, LocalDate expDate) {
        super(userId, date, type, cardNumber);
        this.cardNumber = cardNumber;
        this.cvvCode = cvvCode;
        this.expDate = expDate;
        this.mapKey=this.cardNumber;
    }

    @Override
    protected boolean authorisePayment(Payment payment,User user) {
        if(payment==null && user==null){
            System.out.println("Wrong data");
            return false;
        }
        assert payment != null;
        Payment.Type type=payment.getType();
        if( type.equals(Type.CREDIT_CARD) && prossesor.accountMap !=null){

            String key=user.getCreditCard().getCardNumber();
            if(prossesor.cardHashMap.containsKey(key)){
//                String c= prossesor.cardHashMap.get(key).getCardNumber();
                if(prossesor.cardHashMap.get(key).getCardNumber().equals(user.getCreditCard().getCardNumber()) &&
                        prossesor.cardHashMap.get(key).getCardHolder().equals(user.getCreditCard().getCardHolder()) &&
                        prossesor.cardHashMap.get(key).getExpDate().equals(user.getCreditCard().getExpDate()) &&
                        prossesor.cardHashMap.get(key).getSvvCode().equals(user.getCreditCard().getSvvCode())){
                    return true;
                }
            }
        }
        return false;
    }


}
