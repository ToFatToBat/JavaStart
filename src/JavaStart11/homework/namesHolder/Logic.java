package JavaStart11.homework.namesHolder;

public class Logic {
    private int counter = 0;
    private static int tableSize = 4;
    String [] namesHolders = new String[tableSize];


    public void add(String namesHolder) {
        if (namesHolder == null) {
            throw new NullPointerException("Obiekt jest pusty. Nie posiada wartosci.");
        }
        if (findDuplicate(namesHolder) == true) {
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
            for (String i : namesHolders) {
                if (i.equals(name)) {
                    result = true;
                    continue;
                } else result = false;
            }
            return result;
        }

    }

    public int size() {
//        int i = 0;
        int filledFields = 0;
        for (int i =0; i < counter; i++) {
            if (namesHolders[i] != null) {
                filledFields++;
            }

        }return filledFields;
//        while (!(namesHolders[i] == null)) {
//            filledFields++;
    }


    private boolean findDuplicate(String name) {
        boolean duplicate = false;
        if (counter == 0) {
            return duplicate;
        } else {
            for (int i = 0; i < counter; i++) {
                if ((namesHolders[i]).equals(name) == true) {
                    System.out.println("Wprowadzane imie juz istnieje.");
                    duplicate = true;
                    break;
                } else duplicate = false;

            }
            return duplicate;
        }
    }

    public String[] getNamesHolders() {
        return namesHolders;
    }

    public void setNamesHolders(String[] namesHolders) {
        this.namesHolders = namesHolders;
    }
}
