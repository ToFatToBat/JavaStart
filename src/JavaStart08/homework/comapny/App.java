package JavaStart08.homework.comapny;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Antoni", "Zygzak", "Warsaw", "Doliny Nilu", 22, 7000);

        Student[] students = new Student[3];
        Student student1 = new Student("Albert", "Brzeczyszczykiewicz", "Wroclaw", "Jagielly", 12);
        Student student2 = new Student("Ania", "Pochwala", "Gdansk", "Gorczewska", 89);
        Student student3 = new Student("Edek", "Podolak", "Poznan", "Poznanska", 22);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Group group1 = new Group("zaawansowana", 2, lecturer);
        Group group2 = new Group("sredniozaawansowana", 3, lecturer);

        students[0].addStudentToGroup(group1);
        students[0].addStudentToGroup(group2);
        students[1].addStudentToGroup(group1);
        students[2].addStudentToGroup(group2);


        Grades [] grades = new Grades[5];
        Grades grades1 = new Grades(students[0], group1, 5);
        Grades grades2 = new Grades(students[1], group1, 4);
        grades[0] = grades1;
        grades[1] = grades2;

        System.out.println(group1.toString());
        System.out.println();


        System.out.println(Arrays.toString(students));
        System.out.println();

        System.out.println(Arrays.toString(grades));



    }
}
