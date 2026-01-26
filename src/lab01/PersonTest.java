package lab01;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;

public class PersonTest {

    Person p;

    @Before
    public void setUp() {
        p = new Person("John", "Doe", "12345", "Mr", 1990);
    }

    @Test
    public void testFullName() {
        assertEquals("John Doe", p.fullName());
    }

    @Test
    public void testFormalName() {
        assertEquals("Mr John Doe", p.formalName());
    }

    @Test
    public void testGetAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        assertEquals(currentYear - 1990, p.getAge());
    }

    @Test
    public void testGetAgeWithYear() {
        assertEquals(30, p.getAge(2020));  // 2020 - 1990
    }

    @Test
    public void testToCSV() {
        assertEquals("John,Doe,12345,Mr,1990", p.toCSV());
    }

    @Test
    public void testEquals() {
        Person p2 = new Person("John", "Doe", "12345", "Mr", 1990);
        assertTrue(p.equals(p2));
    }
}