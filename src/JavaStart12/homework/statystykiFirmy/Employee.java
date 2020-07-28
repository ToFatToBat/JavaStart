package JavaStart12.homework.statystykiFirmy;

public class Employee {
    private String name;
    private String lastName;
    private String pesel;
    private Section section;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String lastName, String pesel, Section section, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.section = section;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", section=" + section +
                ", salary=" + salary +
                '}';
    }
}
