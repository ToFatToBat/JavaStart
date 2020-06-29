package JavaStart07.homework.sumaKwadratow;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sumSquareNumber = 0;
        int sumSquareNumberDifferentMethod = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wielkosc tablicy");
        int tableSize = sc.nextInt();

        int [] table = new int[tableSize];

        for (int i =0; i< table.length; i++) {
            System.out.println("Podaj " + i + " liczbe");
            table[i] = sc.nextInt();
            sumSquareNumber += (table[i] * table[i]);
        }

        System.out.println("Suma kwadratow liczb w tablicy to:" + sumSquareNumber);

        for (int p: table) {
            int i = 0;
            sumSquareNumberDifferentMethod += table[i] * table[i];
            i++;
            System.out.println("Liczba wprowadzona to " + table[p-1]);
        }

        System.out.println("Suma kwadratow liczb w tablicy 2 metoda to:" + sumSquareNumberDifferentMethod);
    }
}
