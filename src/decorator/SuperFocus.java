package decorator;

import student.Student;

public class SuperFocus extends StudentDecorator {
    public SuperFocus(Student student) {
        super(student);
    }

    @Override
    public void arrive() {
        super.arrive();
        System.out.println(decoratedStudent.getName() + " can be super concentrated!");
    }
}
