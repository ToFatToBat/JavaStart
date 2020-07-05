package JavaStart09.homework.autoZKlima;

public class Car extends Vehicle {
    private boolean airConditionIsOn;



    public Car(String name, int tankCapasity, double standardFuelConsumption, boolean airConditionIsOn) {
        super(name, tankCapasity, standardFuelConsumption);
        this.airConditionIsOn = airConditionIsOn;
    }

    public boolean isAirConditionIsOn() {
        return airConditionIsOn;
    }

    public void setAirConditionIsOn(boolean airConditionIsOn) {
        this.airConditionIsOn = airConditionIsOn;
    }

    @Override
    public double avrFuelConsumption(Vehicle vehicle) {
    double tmpFuelAvrConsumption;
        if (isAirConditionIsOn() == true) {
        tmpFuelAvrConsumption = standardFuelConsumption + 0.8;
    } else tmpFuelAvrConsumption = standardFuelConsumption;
        return tmpFuelAvrConsumption;
}


    @Override
    public String toString() {
        return super.toString()  +
                "airConditionIsOn= " + airConditionIsOn + '\n';
    }
}
