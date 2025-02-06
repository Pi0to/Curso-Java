package app;

import model.entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\david\\OneDrive\\Documentos\\Prog\\files exercise\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<Log> logSet = new HashSet<>();

            String line = br.readLine();
            while(line != null) {
                System.out.println(line);

                String[] logData = line.split(" ");

                logSet.add(new Log(logData[0], Instant.parse(logData[1])));

                line = br.readLine();
            }

            System.out.printf("Total users: %d", logSet.size());
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}