package App;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

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
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM");

        System.out.println("Enter Department's name: ");
        String department = sc.nextLine();
        Department dep = new Department(department);


        System.out.println("Enter the worker data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();


        System.out.println("Enter the base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, dep);

        System.out.println("How many contracts to this worker: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.printf("Enter the contract #%d data: \n", i +1);

            System.out.println("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.nextLine());

            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        double income = worker.income(year, month);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", income));

    }
}