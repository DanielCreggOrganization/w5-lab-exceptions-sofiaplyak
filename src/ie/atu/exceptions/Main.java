package ie.atu.exceptions;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try{
            account.withdraw(20.2);
            account.withdraw(155);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
