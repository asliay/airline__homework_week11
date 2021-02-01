import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    // Half the plane weight should be reserved for passenger baggage - this method calculates that number.
    public int getFlightBaggageWeight() {
        int planeWeight = this.flight.getPlane().getWeight();
        return planeWeight / 2;
    }

    // Using the given assumption that all bags weigh the same, calculates bag weight according to the
    // reserved weight divided by the total plane capacity.
    public int getBaggageWeightAllowance() {
        int planeWeight = flight.getPlane().getWeight();
        int planeCapacity = flight.getPlane().getCapacity();
        return (planeWeight / 2) / planeCapacity;
    }

    // Calculates how much baggage weight is used up by a specific passenger and their number of bags
    public int getPassengerBaggageWeight(Passenger passenger) {
        int capacity = this.flight.getPlane().getCapacity();
        int bagsWeight = getFlightBaggageWeight() / capacity;
        return passenger.getBagCount() * bagsWeight;
    }

    // Calculates total baggage weight of all customers currently booked onto a flight
    public int getBookedBaggageWeight() {
        int totalBaggageWeight = 0;
        ArrayList<Passenger> bookedPassengers = this.flight.getPassengersList();
        for (Passenger passenger : bookedPassengers) {
            totalBaggageWeight += getPassengerBaggageWeight(passenger);
        }
        return totalBaggageWeight;
    }

    // Calculates remaining weight for baggage
    public int remainingWeightAllowance() {
        int baggageAllowance = getFlightBaggageWeight();
        int bookedBaggage = getBookedBaggageWeight();
        return baggageAllowance - bookedBaggage;
    }

}
