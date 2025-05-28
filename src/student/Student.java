package student;

import strategy.ArrivalStrategy;

public class Student {
    private final String name;
    private final StudentType type;
    private final ArrivalStrategy arrivalStrategy;

    public Student(String name, StudentType type, ArrivalStrategy arrivalStrategy) {
        this.name = name;
        this.type = type;
        this.arrivalStrategy = arrivalStrategy;
    }

    public void arrive() {
        arrivalStrategy.arrive();
    }

    public String getName() {
        return name;
    }

    public StudentType getType() {
        return type;
    }

    public ArrivalStrategy getArrivalStrategy() {
        return arrivalStrategy;
    }
}
