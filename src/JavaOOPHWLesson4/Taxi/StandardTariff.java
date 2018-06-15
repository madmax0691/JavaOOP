package JavaOOPHWLesson4.Taxi;

public class StandardTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 30L + 5L * ride.getDistance() + 2 * ride.getDuration();
    }
}
