package lab01;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Enter 2 people:");

        for (int i = 0; i < 2; i++) {
            String first = SafeInput.getNonZeroLenString(scanner, "Enter First Name");
            String last = SafeInput.getNonZeroLenString(scanner, "Enter Last Name");
            String id = SafeInput.getRegExString(scanner, "Enter ID (digits only)", "\\d+");
            String title = SafeInput.getNonZeroLenString(scanner, "Enter Title (Mr, Ms, Dr, etc.)");
            int yob = SafeInput.getRangedInt(scanner, "Enter Year of Birth", 1940, 2010);

            Person p = new Person(first, last, id, title, yob);
            people.add(p);

            System.out.println("Person added: " + p.formalName());
        }

        try (PrintWriter out = new PrintWriter("people.csv")) {
            for (Person p : people) {
                out.println(p.toCSV());
            }
            System.out.println("All data saved to people.csv");
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        scanner.close();
    }
}