package application;

import bankDataBase.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        double transfer;


        System.out.println("Enter account number: ");
        int accountID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit value: (y/n): ");
        char choice = sc.next().charAt(0);

        if(choice == 'y'){
            System.out.println("Enter initial deposit value: ");
            transfer = sc.nextDouble();

            account = new Account(accountID, name, transfer);
        }
        else account = new Account(accountID, name);


        account.showAccountData();


        System.out.println("Enter a deposit value");
        transfer = sc.nextDouble();
        account.deposit(transfer);

        System.out.println("Updated account data: ");
        account.showAccountData();

        System.out.println("Enter a withdraw value");
        transfer = sc.nextDouble();
        account.withdraw(transfer);

        System.out.println("Updated account data: ");
        account.showAccountData();

        sc.close();
    }
}
