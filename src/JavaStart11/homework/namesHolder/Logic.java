package JavaStart11.homework.namesHolder;

public class Logic {
    private int counter = 0;
    private static int tableSize = 4;
    NamesHolder[] namesHolders = new NamesHolder[tableSize];


    public void add(NamesHolder namesHolder) {
        if (namesHolder == null) {
            throw new NullPointerException("Obiekt jest pusty. Nie posiada wartosci.");
        }
        if (findDuplicate(namesHolder.getName()) == true) {
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
            for (NamesHolder i : namesHolders) {
                if (i.getName().equals(name)) {
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
            if (namesHolders[i].getName() != null) {
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
                if ((namesHolders[i].getName()).equals(name) == true) {
                    System.out.println("Wprowadzane imie juz istnieje.");
                    duplicate = true;
                    break;
                } else duplicate = false;

            }
            return duplicate;
        }
    }
}
