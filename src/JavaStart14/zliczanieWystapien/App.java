package JavaStart14.zliczanieWystapien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        try {
            String fileName = "C:\\Users\\kpapi\\JavaStart\\JavaStart\\src\\JavaStart14\\zliczanieWystapien\\zliczanie.csv";
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            Map<Integer, Integer> numbers = new TreeMap<>();

            while (sc.hasNextLine()) {
                int number = Integer.valueOf(sc.nextLine());
                if (numbers.containsKey(number)) {
                    numbers.put(number, (numbers.get(number) + 1));
                }else numbers.put(number, 1);
            }

            System.out.println(numbers.entrySet());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
