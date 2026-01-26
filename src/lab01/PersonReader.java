package lab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonReader {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        try {
            File file = new File("people.csv");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String firstName = parts[0];
                String lastName = parts[1];
                String id = parts[2];
                String title = parts[3];
                int yob = Integer.parseInt(parts[4]);

                Person p = new Person(firstName, lastName, id, title, yob);
                people.add(p);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("people.csv not found.");
        }

        System.out.println("People read from file:");
        for (Person p : people) {
            System.out.println(p.formalName());
        }
    }
}
