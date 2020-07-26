package JavaStart15.homework.wynikiZawodow;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {
        int option =0;
        List<Player> playerList = new ArrayList<>();
        PlayerReader playerReader = new PlayerReader();



        do {
            try {
                System.out.println("1 - wprowadz zawodnika i wynik" + "\n" + "2 - wyswietl wyniki zawodnikow" + "\n" + "3 - EXIT");
                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        playerList.add(playerReader.playerReaderMethod());
                        break;
                    case 2:
                        System.out.println("Jak posortowac liste:" + "\n" + "1 - rosnaco" + "\n" + "2 - mlejaco");
                        int choice = sc.nextInt();
                        sc.nextLine();
                        if (choice == 1) {
                            playerList.sort(Comparator.comparingInt(Player::getScore).thenComparing(Player::getFirstName));
                        } else {
                            playerList.sort(Comparator.comparingInt(Player::getScore).thenComparing(Player::getFirstName).reversed());
                        }

                        for (List<Player> p : playerList) {
                            System.out.println(p);
                        }
                        break;
                    case 3:
                        System.out.println("Zakonczono program.");
                        break;
                    default:
                        System.out.println("Wprowadzono niewlaciwa opcje.");

                }


            } catch (InputMismatchException e) {
                System.out.println("Nie wprowadzono liczby. Sprobuj jeszcze raz.");
            }
        } while (option != 3);
    }
}
