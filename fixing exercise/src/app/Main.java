package app;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the client data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Birth Date: ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));


        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter order data: ");

        System.out.println("Status: ");
        String status = sc.nextLine();

        Date moment = new Date();

        Order order = new Order(OrderStatus.valueOf(status), moment, client);

        for (int i = 1; i <= n; i++){
            System.out.printf("Enter item #%d data: \n", i);


            System.out.println("Product name: ");
            String pname = sc.nextLine();

            System.out.println("Product price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(pname, price);
            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println("Order summary: ");
        System.out.println(order);
    }
}