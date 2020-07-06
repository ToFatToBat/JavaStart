package JavaStart09.homework.klimatyzacjaWBudynku;

public class AirConditionClass {
    AirConditionerModel airConditionerModel;

    public AirConditionClass(AirConditionerModel airConditionerModel) {
        this.airConditionerModel = airConditionerModel;
    }

    @Override
    public String toString() {
        return "airConditionerModel= " + airConditionerModel + '\n';
    }
}
