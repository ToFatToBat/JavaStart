package JavaStart10.zajecia.porownywanieOsob;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int pesel;
    int age;
    Adress adress;

    public Person(String firstName, String lastName, int pesel, int age, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return pesel == person.pesel &&
                age == person.age &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                adress.equals(person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, age, adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }
}
