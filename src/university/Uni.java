package university;

import student.Student;
import factory.Task;
import factory.TaskFactory;

public class Uni {
    private static Uni instance;

    private Uni() {
        System.out.println("Uni is open!");
    }

    public static Uni getInstance() {
        if (instance == null) {
            instance = new Uni();
        }
        return instance;
    }

    public void conductExam(Student student) {
        student.arrive();
        TaskFactory factory = new TaskFactory();
        Task task = factory.createTask(student.getType());

        System.out.println("Task for " + student.getName() + ": " + task.getDescription());
    }
}
