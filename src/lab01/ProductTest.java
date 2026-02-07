package lab01;

import org.junit.Test;
import static org.junit.Assert.*; // JUnit 4

public class ProductTest {

    @Test
    public void testToCSV() {
        Product p = new Product("Phone", "Smartphone", "001", 699.99);
        assertEquals("Phone,Smartphone,001,699.99", p.toCSV());
    }

    @Test
    public void testToJSON() {
        Product p = new Product("Phone", "Smartphone", "001", 699.99);
        assertEquals("{ \"name\": \"Phone\", \"description\": \"Smartphone\", \"ID\": \"001\", \"cost\": 699.99 }", p.toJSON());
    }

    @Test
    public void testToXML() {
        Product p = new Product("Phone", "Smartphone", "001", 699.99);
        assertEquals("<product><name>Phone</name><description>Smartphone</description><ID>001</ID><cost>699.99</cost></product>", p.toXML());
    }

    @Test
    public void testEquals() {
        Product p1 = new Product("Phone", "Smartphone", "001", 699.99);
        Product p2 = new Product("Laptop", "Computer", "001", 1299.99);
        assertTrue(p1.equals(p2)); // same ID
    }
}