package JavaStart11.homework.SafeBankAccount;

public enum Option {
    EXIT(0, "Wyjscie"),
    STAN_KONTA(1, "Podaj stan konta"),
    WPLATA(2, "Wplac pieniadze"),
    WYPLATA(3, "Wyplac pieniadze");

    private int value;
    private  String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

//    static Option createFromInt(int option) throws NoSuchOptionException {
//        try {
//            return Option.values()[option];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new NoSuchOptionException("Wybrano bledna opcje" + option);
//        }
//    }

    @Override
    public String toString() {
        return value + " " + description;
    }

    public static Option createFromValue(int value) throws NoSuchOptionException {
        try {
            for (Option e : Option.values()) {
                 if (e.equals(value)) {
                    return e;
                }
            }
            return Option.EXIT;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Wybrano bledna opcje" + value);
        }


    }
}
