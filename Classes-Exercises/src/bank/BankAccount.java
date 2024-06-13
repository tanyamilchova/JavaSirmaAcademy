package bank;

import java.util.ArrayList;

public class BankAccount {
    private static int id;
    private double balance;
    private  static double interest=0.02;
    public static ArrayList<BankAccount>accounts=new ArrayList<>();
    BankAccount(){
        this.id++;
        System.out.println("Account ID"+id+" created");
    }


    public static void setInterestRate(double interest){
        BankAccount.interest=interest;
    }
    public static double getInterest(){
       return interest;
    }
    public  void deposit(double amount){
        this.balance+=amount;
    }

    public static void deposit(int id,double amount){
       if(id<=accounts.size()) {
           BankAccount bankAccount = accounts.get(id-1);
           bankAccount.balance += amount;
           System.out.println("Deposited "+amount+" to ID "+id);
       }else {
           System.out.println("Account does not exist");
       }
    }
    public static double getInterest(int id,int years){
        if(id<=accounts.size()) {
            BankAccount bankAccount = accounts.get(id-1);
            System.out.println(BankAccount.interest*years* bankAccount.balance);
            return BankAccount.interest*years* bankAccount.balance;
        }else {
            System.out.println("Account does not exist");
            return 0.0;
        }
    }
public static void main(String[] args) {

    BankAccount bankAccount=new BankAccount();
    BankAccount bankAccount1=new BankAccount();

    BankAccount.accounts.add(bankAccount);
    BankAccount.accounts.add(bankAccount1);

    BankAccount.deposit(1,20);
    BankAccount.deposit(3,20);
    BankAccount.deposit(2,10);

    setInterestRate(1.5);
    getInterest(1,1);
    getInterest(2,1);
    getInterest(3,1);
    }
}
