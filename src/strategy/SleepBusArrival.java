package strategy;

public class SleepBusArrival implements ArrivalStrategy {
    public void arrive() {
        System.out.println("Still sleepy while traveling byy bus!");
    }
}
