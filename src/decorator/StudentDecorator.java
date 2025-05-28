package decorator;

import student.Student;
//dinamichno dobavqne na povedenie
public class StudentDecorator extends Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student student) {
        super(student.getName(), student.getType(), student.getArrivalStrategy());
        this.decoratedStudent = student;
    }

    @Override
    public void arrive() {
        decoratedStudent.arrive();
    }
}