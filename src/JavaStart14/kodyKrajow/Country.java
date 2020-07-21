package JavaStart14.kodyKrajow;

import java.util.Objects;

public class Country {
    String id;
    String name;
    int population;

    public Country(String id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return getPopulation() == country.getPopulation() &&
                Objects.equals(getId(), country.getId()) &&
                Objects.equals(getName(), country.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPopulation());
    }

    @Override
    public String toString() {
        return name + " (" + id + ") ma " + population + " ludnosci.";
    }
}
