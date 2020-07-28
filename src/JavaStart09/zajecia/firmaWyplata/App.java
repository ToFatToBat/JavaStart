package JavaStart09.zajecia.firmaWyplata;

public class App {
    public static void main(String[] args) {

        Person employee1 = new Employee("Adam", "Sak", 2000);
        Person director1 = new Director("Edek", "Wek", 7000, 20000);

        Person [] people = new Person[2];
        people [0] = employee1;
        people[1] = director1;


        for (Person p: people) {
            p.printInfo();
        }


    }
}
