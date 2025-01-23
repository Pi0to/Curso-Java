package bankDataBase;

public class Account {

    private int accountID;
    private String name;
    private double balance;


    public Account (int accountID, String name, double balance){
        this.accountID = accountID;
        this.name = name;
        this.balance = balance;
    }

    public Account (int accountID, String name){
        this.accountID = accountID;
        this.name = name;
    }



    public void showAccountData(){
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n\n", accountID, name, balance);
    }

    public void deposit (double transfer){
        balance += transfer;
    }

    public void withdraw (double transfer){
        balance -= transfer + 5;
    }

}
