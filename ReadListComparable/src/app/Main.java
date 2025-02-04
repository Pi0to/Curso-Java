package app;

import model.entities.Employee;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String path= "C:\\Users\\david\\OneDrive\\Documentos\\Prog\\files exercise\\exercises\\employees.csv";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();

            while(line != null){
                String[] s = line.split(",");

                String name = s[0];
                Double salary = Double.parseDouble(s[1]);


                employees.add(new Employee(name, salary));

                line = br.readLine();
            }

            Collections.sort(employees);

            for(Employee e: employees)
                System.out.println(e);



        }catch(java.io.IOException e){
            System.out.println(e.getMessage());
        }
    }
}