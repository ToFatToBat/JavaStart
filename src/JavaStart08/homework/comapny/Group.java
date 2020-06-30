package JavaStart08.homework.comapny;

import java.util.Arrays;

public class Group {
    private String name;
    private int number;
    private Lecturer lecturer;

    public Group(String name, int number, Lecturer lecturer) {
        this.name = name;
        this.number = number;
        this.lecturer = lecturer;

    }


    @Override
    public String toString() {
        return "Group name= " + name + "\n" +
                "number=" + number + "\n" +
                "lecturer=" + lecturer + '\n';
    }
}
