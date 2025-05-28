package decorator;

import student.Student;

public class FastWriting extends StudentDecorator {
    public FastWriting(Student student) {
        super(student);
    }

    @Override
    public void arrive() {
        super.arrive();
        System.out.println(decoratedStudent.getName() + " can write fast!");
    }
}
