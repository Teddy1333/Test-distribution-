package factory;

import student.StudentType;

public class TaskFactory {
    public Task createTask(StudentType type) {

        return switch (type) {
            case WUNDERKIND -> new ConfusingTask();
            case FITNESS -> new FunnyTask();
            case LUCKY -> new EasyTask();
        };
    }
}
