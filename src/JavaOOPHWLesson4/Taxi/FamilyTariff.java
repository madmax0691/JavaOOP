package JavaOOPHWLesson4.Taxi;

public class FamilyTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 50L + 20L * ride.getDistance() / ride.getPassengers();
    }
}
