package JavaStart09.zajecia.firmaWyplata;

public class Director extends Employee {
    int bonus;

    public Director(String name, String surname, int salary, int bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    @Override
    public int totalPayment () {
        return super.totalPayment() + bonus;
    }

    @Override
    public String toString() {
        return "Director{" +
                "bonus=" + bonus +
                ", salary=" + salary +
                "} " + super.toString();
    }
    @Override
    public void printInfo () {
        System.out.println(toString());
    }
}
