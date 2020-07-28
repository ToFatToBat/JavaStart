package JavaStart14.zajecia.mapaKlientow;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Integer, Customer> customerMap = new HashMap<>();

        customerMap.put(1,new Customer("Karol", "ABC", "123456"));
        customerMap.put(3,new Customer("Adam", "CVB", "333"));
        customerMap.put(2,new Customer("Piotr", "DSF", "444"));

        for (Customer customer : customerMap.values()) {
            System.out.println(customer);
        }

        for (Map.Entry<Integer, Customer> customerEntry : customerMap.entrySet()) {
            System.out.println(customerEntry);
        }

        for (Integer integer : customerMap.keySet()) {
            System.out.println(integer);
        }

    }
}
