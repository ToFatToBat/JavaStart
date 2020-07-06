package JavaStart09.homework.klimatyzacjaWBudynku;

import java.util.Arrays;

import static JavaStart09.homework.klimatyzacjaWBudynku.AirConditionerModel.BASIC;
import static JavaStart09.homework.klimatyzacjaWBudynku.AirConditionerModel.PRO;

public class App {
    public static void main(String[] args) {

        AirConditionClass airConditionBasic = new AirConditionClass(BASIC);
        AirConditionClass airConditionPro = new AirConditionClass(PRO);
        Room[] rooms = new Room[2];
        Room room1 = new Room(28, 5, airConditionPro, 1, 25);
        Room room2 = new Room(23, 1, airConditionBasic, 1, 25);
        rooms[0] = room1;
        rooms[1] = room2;

        System.out.println(Arrays.toString(rooms));
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());
        System.out.println(rooms[0].tempDecrease());


    }
}