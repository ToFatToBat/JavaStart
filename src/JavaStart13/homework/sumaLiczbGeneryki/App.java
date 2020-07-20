package JavaStart13.homework.sumaLiczbGeneryki;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        double inputNumber = 0;


        do {
            System.out.println("Podaj liczbe:");
            inputNumber = sc.nextDouble();
            if (inputNumber>0) {
                lista.add(inputNumber);
            }

        } while (inputNumber > 0);


        for (Double element: lista){
            System.out.println(element);
        }
        System.out.println(lista.toString());

        System.out.println("---------------");

        for (int i = (lista.size()-1); i >= 0; i--) {
            System.out.println(lista.get(i));

        }



    }
}
