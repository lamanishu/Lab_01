package lab01;

import lab01.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", "Doe", "123", "Mr.", 1990);
        System.out.println(p.fullName());
        System.out.println(p.formalName());
        System.out.println(p.getAge());
    }
}
