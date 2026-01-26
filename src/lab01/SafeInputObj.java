package lab01;

import java.util.Scanner;

public class SafeInputObj {

    private Scanner pipe;

    // Default constructor
    public SafeInputObj() {
        pipe = new Scanner(System.in);
    }

    // Get a string that is not empty
    public String getNonZeroLenString(String prompt) {
        String ret = "";
        do {
            System.out.print(prompt + ": ");
            ret = pipe.nextLine();
        } while (ret.length() == 0);
        return ret;
    }

    // Get an int in range
    public int getRangedInt(String prompt, int low, int high) {
        int value = 0;
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high) done = true;
                else System.out.println("Out of range!");
            } else {
                pipe.nextLine();
                System.out.println("Must enter an integer!");
            }
        } while (!done);
        return value;
    }

    // Get Y/N answer
    public boolean getYNConfirm(String prompt) {
        boolean done = false;
        boolean result = true;
        do {
            System.out.print(prompt + " [Y/N]: ");
            String ans = pipe.nextLine();
            if (ans.equalsIgnoreCase("Y")) { result = true; done = true; }
            else if (ans.equalsIgnoreCase("N")) { result = false; done = true; }
            else System.out.println("You must answer Y or N!");
        } while (!done);
        return result;
    }
}
