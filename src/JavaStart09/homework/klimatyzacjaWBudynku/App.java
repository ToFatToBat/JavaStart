package JavaStart09.homework.klimatyzacjaWBudynku;

import java.util.Arrays;

import static JavaStart09.homework.klimatyzacjaWBudynku.AirConditionerModel.BASIC;
import static JavaStart09.homework.klimatyzacjaWBudynku.AirConditionerModel.PRO;

public class App {
    public static void main(String[] args) {


        Room[] rooms = new Room[2];
        Room room1 = new Room(28, 5, PRO, 1, 25);
        Room room2 = new Room(23, 1, BASIC, 1, 25);
        rooms[0] = room1;
        rooms[1] = room2;

        System.out.println(Arrays.toString(rooms));

        System.out.println(rooms[0].tempDecrease());
        System.out.println((rooms[0].getTemperature()));
        System.out.println(rooms[0].tempDecrease());
        System.out.println((rooms[0].getTemperature()));
        System.out.println(rooms[0].tempDecrease());
        System.out.println((rooms[0].getTemperature()));
        System.out.println(rooms[0].tempDecrease());
        System.out.println((rooms[0].getTemperature()));



    }
}