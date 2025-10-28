package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Setting locale and scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Map to store candidates by name
        Map<String, Integer> votes = new LinkedHashMap<>();


        // Map to store candidate objects by name
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Try-with-resources for BufferedReader

            String line = br.readLine(); // Reading first line
            while (line != null) { // Looping through lines

                String[] fields = line.split(","); // Splitting line into fields
                String name = fields[0]; // Candidate name
                int votesCount = Integer.parseInt(fields[1]); // Candidate votes

                if (votes.containsKey(name)) { // Check if candidate already exists
                    int currentVotes = votes.get(name); // Get current votes
                    votes.put(name, currentVotes + votesCount); // Update votes
                } else {
                    votes.put(name, votesCount); // Add new candidate
                }

                line = br.readLine(); // Read next line
            }
            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
