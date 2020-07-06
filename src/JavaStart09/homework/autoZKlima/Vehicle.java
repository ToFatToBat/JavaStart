package JavaStart09.homework.autoZKlima;

public class Vehicle {
    private String name;
    private int tankCapasity;
    private double standardFuelConsumption;



    public Vehicle(String name, int tankCapasity, double standardFuelConsumption) {
        this.name = name;
        this.tankCapasity = tankCapasity;
        this.standardFuelConsumption = standardFuelConsumption;
    }

    public  double carRange() {
        return getTankCapasity() / avrFuelConsumption();
    }


    public double avrFuelConsumption() {
        return getTankCapasity() / getStandardFuelConsumption();
    }

    public String getName() {
        return name;
    }

    public int getTankCapasity() {
        return tankCapasity;
    }

    public double getStandardFuelConsumption() {
        return standardFuelConsumption;
    }

    @Override
    public String toString() {
        return name + '\n' +
                "tankCapasity= " + tankCapasity + '\n' +
                "avrFuelConsumption= " + standardFuelConsumption + '\n';
    }
}
