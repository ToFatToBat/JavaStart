package JavaStart14.kodyKrajow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String filename = "C:\\Users\\kpapi\\JavaStart\\JavaStart\\src\\JavaStart14\\kodyKrajow\\countries.csv";
        File file = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Country> countryMap1 =  dataUploadAndLoad(sc);





        System.out.println("Podaj jeden z indeksow w celu wyswietlenia pelnej informacji:");
        System.out.println(countryMap1.keySet());
        Scanner scanner = new Scanner(System.in);
        String choosenKeySet = scanner.nextLine();
        System.out.println(countryMap1.get(choosenKeySet));

    }

    public static Map<String, Country> dataUploadAndLoad (Scanner sc) {


        Map<String, Country> countryMap = new HashMap<>();

        while (sc.hasNextLine()) {
            String oneLine = sc.nextLine();
            String[] oneLineTable = oneLine.split(";");
            Country country = new Country(oneLineTable[0], oneLineTable[1], Integer.valueOf(oneLineTable[2]));
            countryMap.put(oneLineTable[0], country);
        }

        return countryMap;
    }

    public static void userChoise () {

    }

    public static void printData () {

    }
}