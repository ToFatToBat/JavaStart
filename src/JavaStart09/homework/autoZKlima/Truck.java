package JavaStart09.homework.autoZKlima;

public class Truck extends Car {

  private   int loadWeight;


    public Truck(String name, int tankCapasity, double standardFuelConsumption, boolean airConditionIsOn, int loadWeight) {
        super(name, tankCapasity, standardFuelConsumption, airConditionIsOn);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    @Override
    public double avrFuelConsumption() {
        double tmpFuelAvrConsumption;
        if (super.isAirConditionIsOn() == true) {
            tmpFuelAvrConsumption = super.getStandardFuelConsumption() + 1.6 + getLoadWeight() / 100 * 0.5;
        } else tmpFuelAvrConsumption = super.getStandardFuelConsumption() + getLoadWeight() / 100 * 0.5;
        return tmpFuelAvrConsumption;
    }


    @Override
    public String toString() {
        return super.toString()  +
                "loadWeight= " + loadWeight + '\n';
    }
}
