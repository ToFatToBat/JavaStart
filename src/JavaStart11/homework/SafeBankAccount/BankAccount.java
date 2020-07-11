package JavaStart11.homework.SafeBankAccount;

public class BankAccount {
    private Person person;
    private double accountBalance;

    public BankAccount(Person person, double accountBalance) {
        validate(person);
        this.person = person;
        this.accountBalance = accountBalance;
    }

    public void validate(Person person) {
        if (person == null) {
            throw new NullPointerException("Do konta nie zostala przypisana osoba.");
        }
    }

    public double deposit (double depositAmount) {
        accountBalance += depositAmount;
        return accountBalance;
    }

    public double withdraw (double withdrawAmoun) {
       if (withdrawAmoun > accountBalance){

           throw new IllegalArgumentException("Brak srodkow na koncie." +'\n' +  "Probujesz wyplacic " + withdrawAmoun + '\n'  +"Posiadasz na koncie " + accountBalance);
       }
        accountBalance -= withdrawAmoun;
       return accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
