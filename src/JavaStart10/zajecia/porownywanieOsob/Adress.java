package JavaStart10.zajecia.porownywanieOsob;

import java.util.Objects;

public class Adress {
    String city;
    String road;

    public Adress(String city, String road) {
        this.city = city;
        this.road = road;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress)) return false;
        Adress adress = (Adress) o;
        return city.equals(adress.city) &&
                road.equals(adress.road);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, road);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", road='" + road + '\'' +
                '}';
    }
}
