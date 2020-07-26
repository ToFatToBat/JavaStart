package JavaStart15.zajecia.sortowanieKomputerow;

import java.util.*;

public class App {
    public static void main(String[] args) {


//        System.out.println(list);
//        Collections.sort(list, Computer::compareTo);
//        System.out.println(list);
//        Collections.sort(list, Comparator.comparingInt(Computer:: getCpu));
//        System.out.println(list);
//        Collections.sort(list, Comparator.comparingInt(Computer::getMemory));
//        System.out.println(list);


        List<Computer> list = createComputers();
        int option = getSortOption();

        switch (option) {
                case 1:
                    Collections.sort(list, Computer::compareTo);
                    System.out.println(list);
                    break;
                case 2:
                    Collections.sort(list, Comparator.comparingInt(Computer::getCpu));
                    System.out.println(list);
                    break;
                case 3:
                    Collections.sort(list, Comparator.comparingInt(Computer::getMemory));
                    System.out.println(list);
                    break;
                case 4:
                    System.out.println("Zakonczono prace programu.");
                    break;
                default:
                    System.out.println("Brak wybranej opcji.");

            }





    }

    private static int getSortOption() {
        Scanner sc = new Scanner(System.in);
        int option;


        System.out.println("Wpisz po jakim kryterium chcesz sortowac komputery?");
        System.out.println("1 - name" + "\n" + "2 - cpu " + "\n" + "3 - memory" + "\n" + "4- exit");
        option = sc.nextInt();
        return option;
    }


    private static List<Computer> createComputers() {
        Computer computer1 = new Computer("A", 200, 300);
        Computer computer2 = new Computer("B", 300, 300);
        Computer computer3 = new Computer("B", 300, 600);
        Computer computer4 = new Computer("B", 200, 800);
        Computer computer5 = new Computer("C", 100, 1600);
        Computer computer6 = new Computer("D", 500, 200);

        List<Computer> lista = new ArrayList<>();

        lista.add(computer1);
        lista.add(computer2);
        lista.add(computer3);
        lista.add(computer4);
        lista.add(computer5);
        lista.add(computer6);
        return lista;
    }

}
