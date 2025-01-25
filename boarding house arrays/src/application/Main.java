package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rents;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Rents[] rent = new Rents[n];
        Rents backup = new Rents();

        for (int i = 0; i < rent.length; i++){
            System.out.printf("Rent #%d: \n", i+1);

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            rent[i] = new Rents(name, email, room);
        }

        arrange(rent);

        System.out.println("Busy rooms: ");

        for (int i = 0; i < rent.length; i++){
            System.out.println(rent[i]);
        }

    }

    public static void arrange (Rents[] rent){

        Rents backup;

        for (int i = 0; i < rent.length - 1; i++){
            for(int j = 1; j < rent.length; j ++){
                if(rent[i].getRoom() > rent[j].getRoom()){
                    backup = rent[i];
                    rent[i] = rent[j];
                    rent[j] = backup;
                }
            }
        }
    }
}