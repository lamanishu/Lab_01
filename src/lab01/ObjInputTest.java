package lab01;

public class ObjInputTest {
    public static void main(String[] args) {
        SafeInputObj input = new SafeInputObj();

        String name = input.getNonZeroLenString("Enter your name");
        int age = input.getRangedInt("Enter your age", 1, 120);
        boolean likesJava = input.getYNConfirm("Do you like Java?");

        System.out.println("\nResults:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Likes Java: " + likesJava);
    }
}
