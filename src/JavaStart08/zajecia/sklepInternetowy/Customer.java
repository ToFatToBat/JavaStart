package JavaStart08.zajecia.sklepInternetowy;

public class Customer extends People {
    int spentMoney;


    public Customer(String name, String surname, String city, String road, int houseNumber, int spentMoney) {
        super(name, surname, city, road, houseNumber);
        this.spentMoney = spentMoney;
    }



}
