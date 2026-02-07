package lab01;

import java.util.Scanner;

public class SafeInputObj {

    private Scanner pipe;

    public SafeInputObj() {
        pipe = new Scanner(System.in);
    }

    public SafeInputObj(Scanner scanner) {
        pipe = scanner;
    }

    /**
     * Ask user for a string and make sure it's not empty
     * @param prompt Message to show
     * @return User's input as a string
     */
    public String getString(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = pipe.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    /**
     * Ask user for an integer
     * @param prompt Message to show
     * @return The integer entered
     */
    public int getInt(String prompt) {
        int num;
        while(true) {
            System.out.print(prompt);
            if(pipe.hasNextInt()) {
                num = pipe.nextInt();
                pipe.nextLine(); // clear the newline
                return num;
            } else {
                System.out.println("That's not a number. Try again.");
                pipe.nextLine();
            }
        }
    }

    /**
     * Ask user for an integer within a range
     * @param prompt Message to show
     * @param min Minimum value
     * @param max Maximum value
     * @return The integer within the range
     */
    public int getInt(String prompt, int min, int max) {
        int value;
        while(true) {
            value = getInt(prompt + " (" + min + "-" + max + "): ");
            if(value >= min && value <= max) return value;
            System.out.println("Number not in range. Try again.");
        }
    }

    /**
     * Ask user for a yes/no answer
     * @param prompt Message to show
     * @return true for yes, false for no
     */
    public boolean getYN(String prompt) {
        String input;
        while(true) {
            System.out.print(prompt + " (y/n): ");
            input = pipe.nextLine().trim().toLowerCase();
            if(input.equals("y") || input.equals("yes")) return true;
            if(input.equals("n") || input.equals("no")) return false;
            System.out.println("Please type y or n.");
        }
    }
}