package JavaStart09.zajecia.firmaWyplata;

import JavaStart08.zajecia.sklepInternetowy.People;

public class Employee extends Person {
    int salary;

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    public int totalPayment () {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "} " + super.toString();
    }
    @Override
    public void printInfo () {
        System.out.println(toString());
    }
}
