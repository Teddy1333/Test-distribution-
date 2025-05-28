import decorator.*;
import strategy.*;
import student.*;
import university.Uni;

public class Main {
    public static void main(String[] args) {
        Uni uni = Uni.getInstance();

        // mimi kalitko s telepatiq i teleport
        Student luckyStudent = new Student("Mimi", StudentType.LUCKY, new TeleportArrival());
        luckyStudent = new Telepathy(luckyStudent);

        // stef wunderkind s koncentracia i skoci i tichane
        Student smartStudent = new Student("Stefi", StudentType.WUNDERKIND, new JumpRunArrival());
        smartStudent = new SuperFocus(smartStudent);

        //iva fintess spi v avtobusa i pishe burzo
        Student gymStudent = new Student("Iva", StudentType.FITNESS_FREAK, new SleepBusArrival());
        gymStudent = new FastWriting(gymStudent);

        System.out.println("\n-- this is the test Mimi gets --");
        uni.conductExam(luckyStudent);

        System.out.println("\n-- this is the test Stefi gets --");
        uni.conductExam(smartStudent);

        System.out.println("\n-- this is the test Iva gets --");
        uni.conductExam(gymStudent);
    }
}
