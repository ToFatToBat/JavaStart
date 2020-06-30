package JavaStart08.homework.comapny;

public class People {
    private String name;
    private String surname;
    private String city;
    private String road;
    private int houseNumber;

    protected People(String name, String surname, String city, String road, int houseNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.road = road;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", road='" + road + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
