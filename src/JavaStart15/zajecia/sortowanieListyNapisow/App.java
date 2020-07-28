package JavaStart15.zajecia.sortowanieListyNapisow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(9);
        lista.add(5);
        lista.add(14);
        lista.add(7);

       System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);


    }

}
