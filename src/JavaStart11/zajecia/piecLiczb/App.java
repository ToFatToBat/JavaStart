package JavaStart11.zajecia.piecLiczb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("podaj 5 liczb:");


        do {
            try {


                System.out.println("Podaj kolejna liczbe: ");
                int next = sc.nextInt();
                sum += next;
                counter++;
            } catch (InputMismatchException e) {
                System.out.println("Nie podano liczby, spróbuj jeszcze raz: ");
                sum += sc.nextInt();
            }

        } while (counter < 5);


        System.out.println("POdales wszystkie liczby");


        System.out.println("Suma liczb to: " + sum);


    }
}

