package JavaStart09.homework.autoZKlima;

public class Logic {
    double tmpFuelAvrConsumption;
    Vehicle vehicle = new Vehicle();
    Car car = new Car();
    Truck truck = new Truck();


    public double carRange(Vehicle vehicle) {
        return vehicle.tankCapasity / avrFuelConsumption(vehicle);
    }

    public double avrFuelConsumption(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            tmpFuelAvrConsumption = carFuelConsumption();
        } else if (vehicle instanceof Truck) {
            tmpFuelAvrConsumption = truckFuelConsumption();
        }
        return tmpFuelAvrConsumption;
    }

    private double carFuelConsumption() {
        double tmpFuelAvrConsumption;
        if (car.isAirConditionIsOn() == true) {
            tmpFuelAvrConsumption = car.standardFuelConsumption + 0.8;
        } else tmpFuelAvrConsumption = car.standardFuelConsumption;
        return tmpFuelAvrConsumption;
    }

    private double truckFuelConsumption() {
        double tmpFuelAvrConsumption;
        if (truck.isAirConditionIsOn() == true) {
            tmpFuelAvrConsumption = truck.standardFuelConsumption + 1.6 + truck.getLoadWeight() / 100 * 0.5;
        } else tmpFuelAvrConsumption = truck.standardFuelConsumption + truck.getLoadWeight() / 100 * 0.5;
        return tmpFuelAvrConsumption;
    }
}
