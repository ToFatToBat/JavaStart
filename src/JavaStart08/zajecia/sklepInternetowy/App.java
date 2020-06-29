package JavaStart08.zajecia.sklepInternetowy;

public class App {
    public static void main(String[] args) {

        Customer customer = new Customer("Karol", "Pap", "LBN", "Rozto", 23, 2000);
        Director director = new Director("Adam", "Sak", "Wawa", "Mroczna", 12, 25000, 100000);

        System.out.println(customer.toString());
        System.out.println(director.toString());
    }
}
