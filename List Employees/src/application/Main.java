package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("How many employees will be registered: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < n; i++){
            System.out.printf("Employee %d: ", i+1);

            System.out.println("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();


            employees.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee ID that will have the salary increase: ");
        int id = sc.nextInt();

        Employee e = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(e == null) System.out.println("This ID doesn't exist: ");
        else{
            System.out.println("Enter the percentage of the increase: ");
            double p = sc.nextDouble();

            employees.get(employees.indexOf(e)).increaseSalary(p);

        }


        for(Employee i : employees) System.out.println(i);

    }

}