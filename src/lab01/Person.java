package lab01;

import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    // Constructor
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getID() { return ID; }
    public String getTitle() { return title; }
    public int getYOB() { return YOB; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setTitle(String title) { this.title = title; }
    public void setYOB(int YOB) { this.YOB = YOB; }

    // Methods
    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    // Get age using current year
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - YOB;
    }

    // Get age using a specific year
    public int getAge(int year) {
        return year - YOB;
    }

    // Convert to CSV string
    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.ID.equals(other.ID) &&
                this.title.equals(other.title) &&
                this.YOB == other.YOB;
    }
}