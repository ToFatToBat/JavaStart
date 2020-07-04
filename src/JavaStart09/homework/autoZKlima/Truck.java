package JavaStart09.homework.autoZKlima;

public class Truck extends Car {

  private   int loadWeight;

    public Truck () {

    }

    public Truck(String name, int tankCapasity, double standardFuelConsumption, boolean airConditionIsOn, int loadWeight) {
        super(name, tankCapasity, standardFuelConsumption, airConditionIsOn);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "loadWeight= " + loadWeight + '\n';
    }
}
