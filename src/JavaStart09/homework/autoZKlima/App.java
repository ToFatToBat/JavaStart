package JavaStart09.homework.autoZKlima;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        Vehicle car = new Car("Ferrari", 90, 24, false);
        Vehicle truck = new Truck("Man", 1200, 36, false, 27000);

        vehicles[0] = car;
        vehicles[1] = truck;


        System.out.println(Arrays.toString(vehicles));
        System.out.println();
        System.out.println(car.carRange());
        System.out.println(truck.carRange());


        System.out.println();
        System.out.println();

        ((Car) car).setAirConditionIsOn(true);
        ((Truck) truck).setAirConditionIsOn(true);

        System.out.println(Arrays.toString(vehicles));
        System.out.println();
        System.out.println(car.carRange());
        System.out.println(truck.carRange());

    }
}
