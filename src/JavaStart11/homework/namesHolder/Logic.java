package JavaStart11.homework.namesHolder;

public class Logic {
    private int counter = 0;
    private static int tableSize = 4;
    String[] namesHolders = new String[tableSize];


    public void add(String namesHolder) {
        if (namesHolder == null) {
            throw new NullPointerException("Obiekt jest pusty. Nie posiada wartosci.");
        }
        if (contains(namesHolder) == true) {
            throw new IllegalArgumentException("Podana wartosc juz wystepuje.");
        }
        if (counter > tableSize) {
            throw new NullPointerException("Brak miejsca w tabeli.");
        } else {
            namesHolders[counter] = namesHolder;
            counter++;
        }
    }

    public boolean contains(String name) {
        if (name == null) {
            throw new IllegalArgumentException("wprowadzona wartosc jest rowna null.");
        } else {
            boolean result = false;  //Jak mozna obejsc unikniecie bledu w ostatniom result. Jak tu nie przypisze wartosci to wywala w ostatnim result blad.
            if (counter == 0) {
                return result;
            } else {
                for (int i = 0; i < counter; i++) {
                    if ((namesHolders[i]).equals(name) == true) {
                        System.out.println("Wprowadzane imie juz istnieje.");
                        result = true;
                        break;
                    } else result = false;

                }
                return result;
            }

        }
    }

    public int size() {
        int filledFields = 0;
        for (int i = 0; i < counter; i++) {
            if (namesHolders[i] != null) {
                filledFields++;
            }

        }
        return filledFields;

    }


}
