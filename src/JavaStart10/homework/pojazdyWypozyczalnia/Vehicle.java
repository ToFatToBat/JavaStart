package JavaStart10.homework.pojazdyWypozyczalnia;

public abstract class Vehicle implements Moveable {
    private String name;
    private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String turnLeft() {
        return String.valueOf(Direction.LEFT);
    }

    @Override
    public String turnRight() {
        return String.valueOf(Direction.RIGHT);
    }

    @Override
    public String goForward() {
        return String.valueOf(Direction.FORWARD);
    }

    @Override
    public String goBack() {
        return String.valueOf(Direction.BACK);
    }

    @Override
    public String toString() {
        return "name= " + getName() + '\n' +
                "year= " + getYear() + '\n';
    }
}
