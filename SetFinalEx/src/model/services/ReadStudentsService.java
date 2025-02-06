package model.services;

import java.util.Scanner;
import java.util.Set;

public class ReadStudentsService {

    public Scanner sc = new Scanner(System.in);

    public void studentsIn (Set<Integer> set, char c) {

        sc = new Scanner(System.in);

        System.out.printf("How many students for course %c: ", c);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
    }
}
