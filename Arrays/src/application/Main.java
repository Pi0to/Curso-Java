package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double sum = 0;

        n = sc.nextInt();
        Product[] product1 = new Product[n];

        for (i=0; i < n; i++){
            System.out.println("Enter the product name and price: ");
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            product1[i] = new Product(name, price);
        }

        for (i=0; i < n; i++){
            sum += product1[i].getPrice();
        }

        System.out.printf("The average price is: %.2f", sum / n);


        sc.close();
    }
}