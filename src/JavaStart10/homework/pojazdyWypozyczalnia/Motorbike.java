package JavaStart10.homework.pojazdyWypozyczalnia;

public class Motorbike extends Vehicle {

   private int speedLimit;

    public Motorbike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return super.toString() +
                "speedLimit= " + speedLimit + "\n";
    }
}
