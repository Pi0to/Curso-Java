package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Package;

public class Source {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Package product;

        product = new Package();

        System.out.println("Enter product data (Name, Price, Quantity in Stock): ");
        product.scan();
        product.showProductData();
        product.addProduct();
        product.removeProduct();

        sc.close();
    }
}
