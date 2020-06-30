package JavaStart08.homework.comapny;

import java.util.Arrays;

public class Group {
    String name;
    int number;
    Lecturer lecturer;
    Student [] students;

    public Group(String name, int number, Lecturer lecturer, Student [] students) {
        this.name = name;
        this.number = number;
        this.lecturer = lecturer;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", lecturer=" + lecturer +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
