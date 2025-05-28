package decorator;

import student.Student;

public class Telepathy extends StudentDecorator {
    public Telepathy(Student student) {
        super(student);
    }

    @Override
    public void arrive() {
        super.arrive();
        System.out.println(decoratedStudent.getName() + " has telepathy!");
    }
}
