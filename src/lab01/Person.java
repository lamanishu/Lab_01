package lab01;

import java.util.Calendar;

public class Person {
    private String firstName, lastName, ID, title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - YOB;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    @Override
    public String toString() {
        return formalName() + " (" + ID + "), born " + YOB;
    }
}