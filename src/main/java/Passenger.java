import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private int seatNumber; // assigned randomly only when passenger is booked onto flight
    private Flight bookedFlight; // assigned when passenger is booked onto flight

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = 0;
        this.bookedFlight = null;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBagCount() {
        return this.numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getBookedFlight() {
        return this.bookedFlight;
    }

    public void setBookedFlight(Flight bookedFlight) {
        this.bookedFlight = bookedFlight;
    }
}
