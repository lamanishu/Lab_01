package lab01;

public class SafeInputTest {
    public static void main(String[] args) {
        SafeInputObj input = new SafeInputObj();

        String name = input.getString("Enter a name: ");
        System.out.println("You entered: " + name);

        int age = input.getInt("Enter an integer: ");
        System.out.println("You entered: " + age);

        int year = input.getInt("Enter a year", 2000, 2025);
        System.out.println("You entered: " + year);

        boolean answer = input.getYN("Do you want to continue?");
        System.out.println("You answered: " + answer);
    }
}