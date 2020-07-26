package JavaStart15.homework.wynikiZawodow;

import java.util.Scanner;

public class PlayerReader {
    Scanner sc = new Scanner(System.in);

    public Player playerReaderMethod() {

        System.out.println("Podaj Inie zawodnika: ");
        String firstname = sc.nextLine();
        System.out.println("Podaj nazwisko zawodnika: ");
        String lastname = sc.nextLine();
        System.out.println("Wynik osiagniety:");
        int score = sc.nextInt();
        sc.nextLine();

        Player player = new Player(firstname, lastname, score);

        return player;
    }
}
