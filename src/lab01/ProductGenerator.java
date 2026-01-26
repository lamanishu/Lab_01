package lab01;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Enter 2 products:");
        for (int i = 0; i < 2; i++) {
            String name = SafeInput.getNonZeroLenString(scanner, "Enter Product Name");
            String description = SafeInput.getNonZeroLenString(scanner, "Enter Description");
            String ID = SafeInput.getRegExString(scanner, "Enter Product ID (digits only)", "\\d+");
            double cost = SafeInput.getRangedDouble(scanner, "Enter Cost", 0, 10000);

            Product p = new Product(name, description, ID, cost);
            products.add(p);
            System.out.println("Product added: " + p);

            // Save CSV after each product
            try (PrintWriter out = new PrintWriter("products.csv")) {
                for (Product prod : products) {
                    out.println(prod.toCSV());
                }
            } catch (Exception e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        scanner.close();
    }
}