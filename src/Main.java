import student.Student;
import student.StudentType;
import strategy.*;
import university.Uni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What type of student are you (WUNDERKIND / FITNESS / LUCKY): ");
        String typeInput = scanner.nextLine().toUpperCase();
        StudentType type = StudentType.valueOf(typeInput);

        System.out.println("How do you commute to university:");
        System.out.println("1 - Running and jumping");
        System.out.println("2 - Teleporting");
        System.out.println("3 - Sleep in the bus");
        int arrivalChoice = scanner.nextInt();
        scanner.nextLine();

        ArrivalStrategy arrivalStrategy = switch (arrivalChoice) {
            case 1 -> new JumpRunArrival();
            case 2 -> new TeleportArrival();
            case 3 -> new SleepBusArrival();
            default -> {
                System.out.println("Unknown choice. Default: Running and jumping.");
                yield new JumpRunArrival();
            }
        };

        Student student = new Student(name, type, arrivalStrategy);

        System.out.print("Would you like to change the way you commute? (yes/no): ");
        String change = scanner.nextLine().toLowerCase();

        if (change.equals("yes")) {
            System.out.println("Choose a new way of commuting to university:");
            System.out.println("1 - Running and jumping");
            System.out.println("2 - Teleporting");
            System.out.println("3 - Sleep in the bus");
            int newChoice = scanner.nextInt();

            ArrivalStrategy newStrategy = switch (newChoice) {
                case 1 -> new JumpRunArrival();
                case 2 -> new TeleportArrival();
                case 3 -> new SleepBusArrival();
                default -> arrivalStrategy;
            };

            student.setArrivalStrategy(newStrategy);
        }
        Uni uni = Uni.getInstance();
        uni.conductExam(student);
    }
}
