package JavaStart08.homework.comapny;

public class Lecturer extends Person {
    int salary;


    public Lecturer(String name, String surname, String city, String road, int houseNumber, int salary) {
        super(name, surname, city, road, houseNumber);
        this.salary = salary;

    }

    @Override
    public String toString() {
        return super.toString()  +
                "Salary=" + salary + "\n" ;
    }

}
