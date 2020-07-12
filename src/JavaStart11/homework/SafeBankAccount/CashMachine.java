package JavaStart11.homework.SafeBankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) throws NoSuchOptionException {

        int choosenIntOption;
        Scanner sc = new Scanner(System.in);

        Person person = new Person("Walter", "Rohl", 56);
        BankAccount bankAccount = new BankAccount(person, 389000.34);


        Option option;

        do {

            System.out.println("Wybierz opcje:");
            printOptions();
           // choosenIntOption = sc.nextInt();
           option = getOption();
            switch (option) {
                case STAN_KONTA:
                    System.out.println(bankAccount.getAccountBalance());
                    break;
                case WYPLATA:
                    System.out.println("Podaj kwote wyplaty: ");
                    bankAccount.withdraw(sc.nextInt());
                    break;
                case WPLATA:
                    System.out.println("Podaj wysokosc wplaty: ");
                    bankAccount.deposit(sc.nextInt());
                    break;

            }


        } while (option != Option.EXIT);


//        System.out.println(bankAccount.getAccountBalance());
//        bankAccount.deposit(100000);
//        System.out.println(bankAccount.getAccountBalance());
//        bankAccount.withdraw(600000);
//        System.out.println(bankAccount.getAccountBalance());

    }

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