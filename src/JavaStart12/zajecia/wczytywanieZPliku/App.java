package JavaStart12.zajecia.wczytywanieZPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {


        File plik = new File("C:\\Users\\kpapi\\JavaStart\\JavaStart\\src\\JavaStart12\\zajecia\\wczytywanieZPliku\\plik.txt");

        Scanner sc = new Scanner(plik);

        int lines = 0;
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        sc.close();
    }

}

