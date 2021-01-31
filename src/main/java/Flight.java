import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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

    // Getter for list of passengers on flight
    public ArrayList<Passenger> getPassengersList() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
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

    // Removes and assigns seat number to passener from plane array list of seat numbers
    public void assignSeatNumber(Passenger passenger) {
        ArrayList<Integer> seats = this.plane.getSeatNumbers();
        int passengerSeat = seats.remove(0);
        passenger.setSeatNumber(passengerSeat);
    }

    // Checks available seats, assigns seat number, booked flight to passenger and adds them to passenger list for
    // flight
    public void bookPassenger(Passenger newPassenger) {
        if (checkAvailableSeats() >= 1) {
            assignSeatNumber(newPassenger);
            newPassenger.setBookedFlight(this);
            this.passengers.add(newPassenger);

        }
    }



}
