package app;

import model.entities.Account;
import model.exceptions.EnoughBalanceException;
import model.exceptions.WithdrawLimitException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: \n");

        try {

            System.out.println("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.println("Holder: ");
            String name = sc.nextLine();

            System.out.println("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.println("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, name, initialBalance, withdrawLimit);

            System.out.println("\nEnter the amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);


            System.out.println("new balance: " + account.getBalance());
        } catch (WithdrawLimitException e){
            System.out.println(e.getMessage());
        } catch (EnoughBalanceException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Dados invalidos: " + e);
        }
    }
}