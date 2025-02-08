package app;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\david\\OneDrive\\Documentos\\Prog\\files exercise\\streams\\products.csv";
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while(line != null) {

                String [] fields = line.split(",");

                products.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        double avg = products.stream()
                .map(Product::getPrice)
                .reduce(0.00,(a, b) -> a + b) / products.size();


        System.out.printf("Average price: %.2f\n", avg);

        products.stream()
                .filter(p -> p.getPrice() < avg)
                .sorted((p, p2) -> -1* (p.getName().toUpperCase().compareTo(p2.getName().toUpperCase())))
                .forEach(product -> System.out.println(product.getName()));

    }

}