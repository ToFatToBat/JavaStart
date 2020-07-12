package JavaStart11.homework.namesHolder;

public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        NamesHolder namesHolder1 = new NamesHolder("Karol");
        NamesHolder namesHolder2 = new NamesHolder("Adam");


        logic.add(namesHolder1);
        logic.add(namesHolder2);


        System.out.println(logic.size());

        NamesHolder namesHolder3 = new NamesHolder("Karol");
        NamesHolder namesHolder4 = new NamesHolder("Marek");
        NamesHolder namesHolder5 = new NamesHolder(null);

        logic.add(namesHolder3);

        System.out.println(logic.size());

        logic.add(namesHolder4);
        logic.add(namesHolder5);


    }
}
