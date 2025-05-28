package factory;

import student.StudentType;

public class TaskFactory {
    public Task createTask(StudentType type) {

        return switch (type) {
            case WUNDERKIND -> new FunnyTask();
            case FITNESS_FREAK -> new ConfusingTask();
            case LUCKY -> new EasyTask();
        };
    }
}
