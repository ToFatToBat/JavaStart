package JavaStart07.homework.sumaKwadratow;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sumSquareNumber = 0;
        int sumSquareNumberDifferentMethod = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wielkosc tablicy");
        int tableSize = sc.nextInt();

        double [] table = new  double [tableSize];

        for (int i =0; i< table.length; i++) {
            System.out.println("Podaj " + i + " liczbe");
            table[i] = sc.nextInt();
            sumSquareNumber += Math.pow(table[i], 2);
        }

        System.out.println("Suma kwadratow liczb w tablicy to:" + sumSquareNumber);

        for (double p: table) {

            sumSquareNumberDifferentMethod += Math.pow(p, 2);
            System.out.println("Liczba wprowadzona to " + p);
        }

        System.out.println("Suma kwadratow liczb w tablicy 2 metoda to:" + sumSquareNumberDifferentMethod);
    }
}
