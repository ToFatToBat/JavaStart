package JavaStart07.homework.odwroceniePowitania;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Podaj " + i + " imie:");
            names [i] = sc.nextLine();
        }

        for (int i = names.length; i > 0; i--){
            System.out.println("Czesc " + names[i-1]);
        }
    }
}
