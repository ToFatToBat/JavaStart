package JavaStart10.homework.pojazdyWypozyczalnia;

public class Person {
    private String firsName;
    private String lastName;
    private int id;

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public Person(String firsName, String lastName, int id) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "firsName= " + firsName + '\n' +
                "lastName= " + lastName + '\n' +
                "id= " + id + '\n';
    }
}
