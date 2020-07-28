package JavaStart08.zajecia.metodyStatyczne;

import java.util.Random;

public class StaticMethods {
    public static void main(String[] args) {


        int [] table = {1,2,3};

        upsideDown(table);
        randomeTable(10, 10);



    }
    private static void upsideDown (int [] table) {
        for (int i = table.length; i > 0; i--) {
            int p = i -1;
            System.out.println(table[p]);
        }
    }

    private static void randomeTable (int sizeTable, int randomeLimit) {
        int [] table = new int[sizeTable];
        Random random = new Random(randomeLimit);
        for (int i = 0; i < sizeTable; i++) {
            int randomeNumber = random.nextInt();
            table[i] = randomeNumber;
            System.out.println(table[i]);
        }
    }
}
