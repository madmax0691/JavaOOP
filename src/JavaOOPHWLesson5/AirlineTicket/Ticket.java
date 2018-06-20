package JavaOOPHWLesson5.AirlineTicket;

public class Ticket {
    private final long number;
    private final PassengerInfo passengerInfo;
    private final FlightInfo flightInfo;

    public Ticket(long number, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.number = number;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public long getCost() {
        return flightInfo.getCost();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", passengerInfo=" + passengerInfo +
                ", flightInfo=" + flightInfo +
                '}';
    }
}