package app;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> emps = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.printf("EMPLOYEE %d DATA:\n", i);
            System.out.println("\nOutsourced? (y/n)");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("\nName: ");
            String name = sc.nextLine();

            System.out.println("\nHours: ");
            int hours = sc.nextInt();

            System.out.println("\nValue per hour: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y') {
                System.out.println("\nAddicional charge: ");
                double charge = sc.nextDouble();
                emps.add(new OutsourcedEmployee(name, hours, valuePerHour, charge));
            }
            else emps.add(new Employee(name, hours, valuePerHour));
        }

        System.out.println("PAYMENTS: \n");

        for(Employee e: emps)
            System.out.printf("%s - $ %.2f\n", e.getName(), e.payment());

    }
}