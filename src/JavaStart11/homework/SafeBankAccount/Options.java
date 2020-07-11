package JavaStart11.homework.SafeBankAccount;

public enum Options {
    EXIT(0, "Wyjscie"),
    STAN_KONTA(1, "Podaj stan konta"),
    WPLATA(2, "Wplac pieniadze"),
    WYPLATA(3, "Wyplac pieniadze");

    private int value;
    private String description;

    Options(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static Options createFromInt(int option) throws NoSuchOptionException {
        try {
            return Options.values()[option];
        }catch (ArrayIndexOutOfBoundsException e) {
            throw  new NoSuchOptionException("Wybrano bledna opcje" + option);
        }
    }

    @Override
    public String toString() {
        return  value + " - " + description;
    }
}
