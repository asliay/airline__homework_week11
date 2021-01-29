import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.TESTPLANE);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }


    public int checkAvailableSeats() {
        return ((this.plane.getCapacity()) - passengerCount());
    }

    public void bookPassenger(Passenger newPassenger) {
        if (checkAvailableSeats() >= 1) {
            this.passengers.add(newPassenger);
        }
    }
}
