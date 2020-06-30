package JavaStart08.homework.comapny;

import java.util.Arrays;

public class Student extends People {

    private int groupCount = 0;
    Group[] groups = new Group[10];


    public Student(String name, String surname, String city, String road, int houseNumber) {
        super(name, surname, city, road, houseNumber);
    }

    public void addStudentToGroup(Group group) {
        groups[groupCount] = group;
        groupCount++;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "groups=" + Arrays.toString(groups) + '\n';
    }
}
