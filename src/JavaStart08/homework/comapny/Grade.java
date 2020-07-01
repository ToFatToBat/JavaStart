package JavaStart08.homework.comapny;

public class Grade {

    Student student;
    Group group;
    int grade;

    public Grade(Student student, Group group, int grade) {
        this.student = student;
        this.group = group;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student grades = " + student +
                "Group = " + group  +
                "Grade=" + grade + '\n';
    }
}
