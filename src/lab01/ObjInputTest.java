package lab01;

public class ObjInputTest {
    public static void main(String[] args) {
        SafeInputObj input = new SafeInputObj();

        System.out.println("=== SafeInputObj Test ===");

        String name = input.getString("Enter your name: ");
        System.out.println("You typed: " + name);

        int age = input.getInt("Enter your age: ");
        System.out.println("Your age: " + age);

        int score = input.getInt("Enter your score", 0, 100);
        System.out.println("Score: " + score);

        boolean likesPizza = input.getYN("Do you like pizza?");
        System.out.println("Likes pizza? " + (likesPizza ? "Yes" : "No"));

        System.out.println("=== All tests done ===");
    }
}