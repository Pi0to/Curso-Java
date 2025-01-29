package app;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> prods = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.printf("PRODUCT %d DATA:\n", i);
            System.out.println("\nCommon, used or imported? (c/u/i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("\nName: ");
            String name = sc.nextLine();

            System.out.println("\nPrice: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if(ch == 'i'){
                System.out.println("\nCustoms fee");
                double customsFee = sc.nextDouble();

                prods.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.println("\n Manufacture date: ");
                Date manufactureDate = sdf.parse(sc.nextLine());

                prods.add(new UsedProduct(name, price, manufactureDate));
            } else
                prods.add(new Product(name, price));
        }

        for(Product p: prods)
            System.out.println(p.priceTag());
    }
}