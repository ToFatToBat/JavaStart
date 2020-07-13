package JavaStart11.homework.namesHolder;

public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();



        logic.add("Karol");
        logic.add("Adam");


        System.out.println(logic.size());



 //       logic.add("Karol");

        System.out.println(logic.size());

        logic.add("Marek");
        logic.add(null);

    }
}
