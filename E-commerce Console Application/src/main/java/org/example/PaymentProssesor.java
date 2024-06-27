package org.example;

import org.example.*;

import java.util.*;

public  class PaymentProssesor {
    public HashMap<String,PayPalAccount> accountMap =new HashMap<>();
    public     HashMap<String, CreditCard> cardHashMap =new HashMap<>();

    public void addToMapPaypalAccount(PayPalAccount palAccount){
        if(! accountMap.containsKey(palAccount.getKey())){
            accountMap.put(palAccount.getKey(),palAccount );
        }
    }
    public void addToMapCreditCard(CreditCard creditCard){
        if(! cardHashMap.containsKey(creditCard.getKey())){
            cardHashMap.put(creditCard.getKey(),creditCard );
        }
    }

}
