package JavaStart09.homework.autoZKlima;

public class Vehicle {
    protected String name;
    protected int tankCapasity;
    protected double standardFuelConsumption;

    public Vehicle () {

    }

    public Vehicle(String name, int tankCapasity, double standardFuelConsumption) {
        this.name = name;
        this.tankCapasity = tankCapasity;
        this.standardFuelConsumption = standardFuelConsumption;
    }

    public double avrFuelConsumption () {
     return standardFuelConsumption;
    }

    @Override
    public String toString() {
        return  name + '\n' +
                "tankCapasity= " + tankCapasity + '\n' +
                "avrFuelConsumption= " + standardFuelConsumption + '\n';
    }
}
