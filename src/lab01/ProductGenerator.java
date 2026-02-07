package lab01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProductGenerator
{
    public static void main(String[] args)
    {
        SafeInputObj safe = new SafeInputObj();
        ArrayList<Product> products = new ArrayList<>();

        boolean more = true;

        while (more)
        {
            String name = safe.getString("Enter product name: ");
            String description = safe.getString("Enter product description: ");
            String id = safe.getString("Enter product ID: ");

            int costInt = safe.getInt("Enter product cost: ");
            double cost = costInt; // convert int to double

            Product p = new Product(name, description, id, cost);
            products.add(p);

            more = safe.getYN("Add another product?");
        }

        try (FileWriter writer = new FileWriter("products.csv"))
        {
            for (Product p : products)
            {
                writer.write(p.toCSV() + "\n");
            }
            System.out.println("Products saved to products.csv");
        }
        catch (IOException e)
        {
            System.out.println("Error writing file.");
        }
    }
}