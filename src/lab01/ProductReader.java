package lab01;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        try (Scanner fileScan = new Scanner(new File("products.csv"))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                String description = data[1];
                String ID = data[2];
                double cost = Double.parseDouble(data[3]);

                Product p = new Product(name, description, ID, cost);
                products.add(p);
            }

            System.out.println("Products read from file:");
            for (Product p : products) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}