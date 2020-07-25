package JavaStart14.kodyKrajow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Map<String, Country> countryMap1 = dataUploadAndLoad();
        String choosenKeySet = userChoice(countryMap1);
        printChoice(countryMap1, choosenKeySet);

    }

    private static void printChoice(Map<String, Country> countryMap1, String choosenKeySet) {
        System.out.println(countryMap1.get(choosenKeySet));
    }

    private static String userChoice(Map<String, Country> countryMap1) {
        System.out.println("Podaj jeden z indeksow w celu wyswietlenia pelnej informacji:");
        System.out.println(countryMap1.keySet());
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static Map<String, Country> dataUploadAndLoad() {
        Map<String, Country> countryMap = new HashMap<>();
        try {
            String filename = "C:\\Users\\kpapi\\JavaStart\\JavaStart\\src\\JavaStart14\\kodyKrajow\\countries.csv";
            File file = new File(filename);
            Scanner sc = null;

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String oneLine = sc.nextLine();
                String[] oneLineTable = oneLine.split(";");
                Country country = new Country(oneLineTable[0], oneLineTable[1], Integer.valueOf(oneLineTable[2]));
                countryMap.put(oneLineTable[0], country);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return countryMap;
    }


}
