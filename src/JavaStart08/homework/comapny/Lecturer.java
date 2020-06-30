package JavaStart08.homework.comapny;

public class Lecturer extends People {
    int salary;


    public Lecturer(String name, String surname, String city, String road, int houseNumber, int salary) {
        super(name, surname, city, road, houseNumber);
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "salary=" + salary +
                "} " + super.toString();
    }

}
