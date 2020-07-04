package JavaStart09.homework.autoZKlima;

public class Car extends Vehicle {
    private boolean airConditionIsOn;

    public Car (){

    }

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
    public String toString() {
        return super.toString()  +
                "airConditionIsOn= " + airConditionIsOn + '\n';
    }
}
