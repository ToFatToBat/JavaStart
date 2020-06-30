package JavaStart08.homework.comapny;

public class App {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Antoni", "Zygzak", "Warsaw", "Doliny Nilu", 22, 7000);
        Student[] students = new Student[2];
        Student student1 = new Student("Albert", "Brzeczyszczykiewicz", "Wroclaw", "Jagielly", 12);
        Student student2 = new Student("Ania", "Pochwala", "Gdansk", "Gorczewska", 89);
        students[0] = student1;
        students[1] = student2;
        Group group = new Group("zaawansowana", 2, lecturer, students);

        System.out.println(group.toString());
    }
}
