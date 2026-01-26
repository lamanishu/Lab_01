package lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testToCSV() {
        Product p = new Product("Pen", "Blue ink pen", "101", 1.5);
        assertEquals("Pen,Blue ink pen,101,1.5", p.toCSV());
    }

    @Test
    void testToJSON() {
        Product p = new Product("Pen", "Blue ink pen", "101", 1.5);
        assertEquals("{ \"name\":\"Pen\", \"description\":\"Blue ink pen\", \"ID\":\"101\", \"cost\":1.5 }", p.toJSON());
    }

    @Test
    void testToXML() {
        Product p = new Product("Pen", "Blue ink pen", "101", 1.5);
        assertEquals("<Product><name>Pen</name><description>Blue ink pen</description><ID>101</ID><cost>1.5</cost></Product>", p.toXML());
    }

    @Test
    void testEquals() {
        Product p1 = new Product("Pen", "Blue", "101", 1.5);
        Product p2 = new Product("Pencil", "Red", "101", 0.5);
        assertTrue(p1.equals(p2));
    }
}