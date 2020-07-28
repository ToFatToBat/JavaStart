package JavaStart14.zajecia.mapaKlientow;

import java.util.Objects;

public class Customer {
    int id;
    String firstName;
    String lastName;
    String telNumber;

    public Customer(String firstName, String lastName, String telNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(telNumber, customer.telNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, telNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
