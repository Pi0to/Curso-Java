package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\david\\OneDrive\\Documentos\\Prog\\files exercise\\map\\in.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> votes = new HashMap<>();

            String line = br.readLine();
            while(line != null) {


                String [] fields = line.split(",");


                if(votes.containsKey(fields[0])){
                    votes.put(fields[0], votes.get(fields[0]) + Integer.parseInt(fields[1]));
                } else votes.put(fields[0], Integer.parseInt(fields[1]));

                line = br.readLine();
            }

            for (String name : votes.keySet()){
                System.out.printf("%s: %d votes\n", name, votes.get(name));
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}