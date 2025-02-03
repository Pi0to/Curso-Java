package app;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\david\\OneDrive\\Documentos\\Prog\\files exercise\\in.csv");

        List<Product> products = new ArrayList<>();

        try(Scanner sc = new Scanner(file)){

            List<String> productInfos = new ArrayList<>();

            while(sc.hasNextLine()){
                productInfos.add(sc.nextLine());
            }

            for(String pinfo: productInfos){
                String[] s = pinfo.split(",");

                String name = s[0];
                Double price = Double.parseDouble(s[1]);
                Integer quantity = Integer.parseInt(s[2]);

                products.add(new Product(name, price, quantity));
            }

            Boolean success = new File(file.getParent() + "\\out").mkdir();

            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(file.getParent() + "\\out" + "\\summary.csv"));){

                for (Product p : products) {

                    String s;

                    bw.write(String.format("%s,%.2f", p.getName(), p.totalValue()));
                    bw.newLine();
                }
            }


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}