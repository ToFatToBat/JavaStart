package JavaStart10.homework.pojazdyWypozyczalnia;

import static javax.swing.JSplitPane.LEFT;
import static javax.swing.JSplitPane.RIGHT;

public abstract class Vehicle implements Moveable {
    private String name;
    private int year;
    private Direction direction;

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
    public void turnLeft() {
        direction = Direction.LEFT;
    }

    @Override
    public void turnRight() {
        direction = Direction.RIGHT;
    }

    @Override
    public void goForward() {
        direction = Direction.FORWARD;
    }

    @Override
    public void goBack() {
        direction = Direction.BACK;

    }

    @Override
    public String toString() {
        return "name= " + getName() + '\n' +
                "year= " + getYear() + '\n' +
                "direction " + direction + '\n';
    }
}
