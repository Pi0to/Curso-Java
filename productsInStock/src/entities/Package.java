package entities;
import java.util.Scanner;


public class Package {

    Scanner sc = new Scanner(System.in);

    public String name;
    public double price;
    public int quantity;

    public void scan(){

        name = sc.nextLine();
        price = sc.nextDouble();
        quantity = sc.nextInt();

    }

    public void showProductData(){
        System.out.printf("Product data: %s, $ %.2f, %d units, total: $ %.2f\n\n", name, price, quantity, price * quantity);
    }

    public void addProduct(){
        System.out.println("Enter the number of products to be added in stock: ");
        int productP = sc.nextInt();
        quantity += productP;
        System.out.printf("Updated product data: %s, $ %.2f, %d units, total: $ %.2f\n\n", name, price, quantity, price * quantity);
    }

    public void removeProduct(){
        System.out.println("Enter the number of products to be removed from stock: ");
        int productR = sc.nextInt();
        quantity -= productR;
        System.out.printf("Updated product data: %s, $ %.2f, %d units, total: $ %.2f\n\n", name, price, quantity, price * quantity);
    }

}
