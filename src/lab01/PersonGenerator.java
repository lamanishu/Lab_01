package lab01;

import java.io.PrintWriter;
import java.util.ArrayList;

public class PersonGenerator {

    public static void main(String[] args) {
        SafeInputObj input = new SafeInputObj();  // Use object version of SafeInput
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Enter 2 people:");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            String first = input.getString("Enter First Name: ");
            String last = input.getString("Enter Last Name: ");
            String id = input.getString("Enter ID (digits only): ");
            String title = input.getString("Enter Title (Mr, Ms, Dr, etc.): ");
            int yob = input.getInt("Enter Year of Birth: ", 1940, 2010);

            Person p = new Person(first, last, id, title, yob);
            people.add(p);

            System.out.println("Person added: " + p.formalName());
        }

        try (PrintWriter out = new PrintWriter("people.csv")) {
            for (Person p : people) {
                out.println(p.toCSV());
            }
            System.out.println("\nAll data saved to people.csv");
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}