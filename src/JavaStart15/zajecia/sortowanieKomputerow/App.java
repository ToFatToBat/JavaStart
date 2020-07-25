package JavaStart15.zajecia.sortowanieKomputerow;

import java.util.*;

public class App {
    public static void main(String[] args) {


//        System.out.println(lista);
//        Collections.sort(lista, Computer::compareTo);
//        System.out.println(lista);
//        Collections.sort(lista, Comparator.comparingInt(Computer:: getCpu));
//        System.out.println(lista);
//        Collections.sort(lista, Comparator.comparingInt(Computer::getMemory));
//        System.out.println(lista);


        List<Computer> lista = createComputers();
        Scanner sc = new Scanner(System.in);
        int option;


            System.out.println("Wpisz po jakim kryterium chcesz sortowac komputery?");
            System.out.println("1 - name" + "\n" + "2 - cpu " + "\n" + "3 - memory" + "\n" + "4- exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Collections.sort(lista, Computer::compareTo);
                    printLista(lista);
                    break;
                case 2:
                    Collections.sort(lista, Comparator.comparingInt(Computer::getCpu));
                    printLista(lista);
                    break;
                case 3:
                    Collections.sort(lista, Comparator.comparingInt(Computer::getMemory));
                    printLista(lista);
                    break;
                case 4:
                    System.out.println("Zakonczono prace programu.");
                    break;
                default:
                    System.out.println("Brak wybranej opcji.");

            }





    }

    private static void printLista(List<Computer> lista) {
        System.out.println(lista);
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
