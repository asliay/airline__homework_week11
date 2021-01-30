public class FlightManager {

    // Should have methods to:
    // calculate how much baggage weight should be reserved for each passenger for a flight
    // calculate how much baggage weight is booked by passengers of a flight
    // calculate how much overall weight reserved for baggage remains for a flight

    // Super Extensions
    // Write a method in FlightManager that uses a Binary Search to find a
    // Passenger by seat number. Remember to use the previous method to sort the list first

    public FlightManager() {

    }

    public static int passengerWeightAllowance(Flight flight) {
        int planeWeight = flight.getPlane().getWeight();
        int planeCapacity = flight.getPlane().getCapacity();
        return (planeWeight / 2) / planeCapacity;
    }

    public static int bookedWeight(Flight flight) {
        int weightAllowance = passengerWeightAllowance(flight);
        int bookedPassengers = flight.passengerCount();
        return weightAllowance * bookedPassengers;

    }

    public static int remainingWeightAllowance(Flight flight) {
        int weightAllowance = passengerWeightAllowance(flight);
        int bookedWeight = bookedWeight(flight);
        return weightAllowance - bookedWeight;
    }
}
