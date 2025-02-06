package app;

import model.services.ReadStudentsService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ReadStudentsService rss = new ReadStudentsService();

        Set<Integer> set = new HashSet<>();
        rss.studentsIn(set, 'A');
        rss.studentsIn(set, 'B');
        rss.studentsIn(set, 'C');

        System.out.println("Total students: " + set.size());
        
    }

}