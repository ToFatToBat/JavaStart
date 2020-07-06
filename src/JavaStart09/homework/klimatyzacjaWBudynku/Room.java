package JavaStart09.homework.klimatyzacjaWBudynku;

public class Room extends Building {


    private int no;
    private double borderTemp;


    public Room(double temperature, int capacity, AirConditionClass airConditionClass, int no, double borderTemp) {
        super(temperature, capacity, airConditionClass);
        this.no = no;
        this.borderTemp = borderTemp;
    }


    public double tempDecrease () {
        if (super.getTemperature() < borderTemp) {
            return getTemperature();
        }else
            return  super.tempChangeByAirconditionerModel();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "no= " + no + '\n' +
                "borderTemp=" + borderTemp + "\n";
    }
}
