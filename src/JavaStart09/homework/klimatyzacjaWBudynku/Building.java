package JavaStart09.homework.klimatyzacjaWBudynku;

public abstract class Building {
    private double temperature;
    private int capacity;
    AirConditionerModel airConditionerModel;


    public Building(double temperature, int capacity, AirConditionerModel airConditionerModel) {
        this.temperature = temperature;
        this.capacity = capacity;
        this.airConditionerModel = airConditionerModel;
    }

    protected double tempChangeByAirconditionerModel () {
        if (airConditionerModel == AirConditionerModel.BASIC) {
            temperature -= 1 / capacity;
        } else if (airConditionerModel == AirConditionerModel.PRO) {
            temperature -= 2 / capacity;
        }
        return temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getCapacity() {
        return capacity;
    }

    public AirConditionerModel getAirConditionerModel() {
        return airConditionerModel;
    }

    @Override
    public String toString() {
        return "temperature= " + temperature + '\n' +
                "capacity= " + capacity + '\n' +
                "airConditionerModel= " + airConditionerModel + '\n';
    }
}
