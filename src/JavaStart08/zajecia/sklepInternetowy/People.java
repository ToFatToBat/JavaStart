package JavaStart08.zajecia.sklepInternetowy;

import java.util.PrimitiveIterator;

public class People {
    private String Name;
    private String surname;
    private String city;
    private String road;
    private int houseNumber;

    public People(String name, String surname, String city, String road, int houseNumber) {
        Name = name;
        this.surname = surname;
        this.city = city;
        this.road = road;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "Name='" + Name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", road='" + road + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
