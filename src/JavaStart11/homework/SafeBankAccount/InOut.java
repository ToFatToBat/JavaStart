package JavaStart11.homework.SafeBankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InOut {


    Scanner sc = new Scanner(System.in);

    public static void printOptions() {
        for (Option o : Option.values()) {
            System.out.println(o.toString());
        }

    }

    public static Option getOption() {
        Option option = null;
        DataReader dataReader = new DataReader();
        try {
            option = Option.createFromValue(dataReader.readDataFromUser());
        } catch (NoSuchOptionException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzono wartosc, ktora nie jest liczba.");
        }
        return option;
    }
}
