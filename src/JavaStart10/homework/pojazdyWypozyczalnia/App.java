package JavaStart10.homework.pojazdyWypozyczalnia;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("Robert", "Kubica", 1);
        Person person2 = new Person("Sebastian", "Vettel", 2);

        RentableCar[] rentableCars = new RentableCar[2];
        RentableCar volvo = new RentableCar("Volvo", 2010, 4);
        RentableCar bmw = new RentableCar("BMW", 2002, 2);

        rentableCars[0] = volvo;
        rentableCars[1] = bmw;

        rentableCars[0].rent(person1);
        System.out.println(rentableCars[0].isCarRentedBySomeone());
        rentableCars[0].handOver();
        System.out.println(rentableCars[0].isCarRentedBySomeone());
    }
}
