package JavaStart08.zajecia.sklepInternetowy;

public class Director extends Employee {

    int bonus;

    public Director(String name, String surname, String city, String road, int houseNumber, int salary, int bonus) {
        super(name, surname, city, road, houseNumber, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Director{" +
                "bonus=" + bonus +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
