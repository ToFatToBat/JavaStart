package JavaStart07.homework.quessNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numberToGuess = 120;
        int inputNumber =0 ;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbe:");
            inputNumber = sc.nextInt();
            int inputNumberDivision = inputNumber % 3;
            if (inputNumber < 100 ) {
                System.out.println("Podana liczba jest za mala");
            }else if (inputNumber > 200) {
                System.out.println("Podana liczba jest za duza.");
            }else if (inputNumberDivision != 0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }

        }while (inputNumber != numberToGuess);
            System.out.println("Brawo, to jest wlasciwa liczba.");

    }
}
