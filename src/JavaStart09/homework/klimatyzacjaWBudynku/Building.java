package JavaStart09.homework.klimatyzacjaWBudynku;

public abstract class Building {
    private double temperature;
    private int capacity;
    AirConditionClass airConditionClass;


    public Building(double temperature, int capacity, AirConditionClass airConditionClass) {
        this.temperature = temperature;
        this.capacity = capacity;
        this.airConditionClass = airConditionClass;
    }


    protected double tempChangeByAirconditionerModel() {
        if (airConditionClass.airConditionerModel == AirConditionerModel.BASIC) {
            temperature -= 1.0 / capacity;
        } else if (airConditionClass.airConditionerModel == AirConditionerModel.PRO) {
            temperature -= 2.0 / capacity;
        }
        return temperature;
    }

    public double getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "temperature= " + temperature + '\n' +
                "capacity= " + capacity + '\n' +
                "airConditionerModel= " + airConditionClass.airConditionerModel + '\n';
    }
}
