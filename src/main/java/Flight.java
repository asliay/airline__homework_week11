import java.util.ArrayList;
import java.util.Date;

public class Flight {

    //EXTENSION:
    //Refactor the Flight's departure time to use the Date class
    // (HINT: Look into Type Migration in IntelliJ to refactor faster)

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
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
