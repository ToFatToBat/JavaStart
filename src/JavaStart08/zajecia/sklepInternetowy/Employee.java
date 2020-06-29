package JavaStart08.zajecia.sklepInternetowy;

public class Employee extends People {

    int salary;


    public Employee(String name, String surname, String city, String road, int houseNumber, int salary) {
        super(name, surname, city, road, houseNumber);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
