package JavaStart10.zajecia.porownywanieOsob;

public class App {
    public static void main(String[] args) {

        Adress adress1 = new Adress("Wawa", "Gorcze");
        Adress adress2 = new Adress("Wawa", "Gorcze");
        Person person1 = new Person("Karol", "Pap", 987655432, 35, adress1);
        Person person2 = new Person("Karol", "Pap", 987655432, 35, adress1);
        Adress adress3 = new Adress("LBN", "Arasz");
        Person person3 = new Person("Edek", "kol", 34436456, 21, adress3);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));


        System.out.println(person1.toString());
        System.out.println(person2.toString());
        
    }
}
