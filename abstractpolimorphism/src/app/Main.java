package app;

import entities.Juridical;
import entities.Physical;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> payers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpends = sc.nextDouble();
                payers.add(new Physical(name, income, healthExpends));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                payers.add(new Juridical(name, income, employees));
            }
        }

       double sum = 0;

        for(TaxPayer payer : payers){
            System.out.println("Taxes paid: \n");

            System.out.println(payer);
            sum += payer.taxValue();
        }

        System.out.println("Total Taxes: $ " + sum);
    }
}