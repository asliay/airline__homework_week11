import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight1;
    private Flight flight2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane1;
    private Plane plane2;

    @Before
    public void setUp() {

        passenger1 = new Passenger("Amos Burton", 2);
        passenger2 = new Passenger("Naomi Nagata", 1);
        passenger3 = new Passenger("James Holden", 1);
        plane1 = new Plane(PlaneType.SMALLPLANE);
        plane2 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(plane1, "FJ012", "TYC", "CER", "2120");
        flight2 = new Flight(plane2, "FJ012", "TYC", "CER", "2120");


    }

    // Should have methods to:
    // calculate how much baggage weight should be reserved for each passenger for a flight

    @Test
    public void canCalculatePassengerWeightAllowance(){
        int passengerWeightAllowance = FlightManager.passengerWeightAllowance(flight1);
        assertEquals(10, passengerWeightAllowance);
    }

    // calculate how much baggage weight is booked by passengers of a flight
    @Test
    public void canCalculateBookedWeight() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(20, FlightManager.bookedWeight(flight1));
    }
    // calculate how much overall weight reserved for baggage remains for a flight
//    @Test
//    public void canCalculateRemainingBaggageAllowance() {
//        flight2.bookPassenger(passenger1);
//        flight2.bookPassenger(passenger2);
//        flight2.bookPassenger(passenger3);
//        assertEquals(10, FlightManager.remainingWeightAllowance(flight2));
//    }

    // Super Extensions
    // Write a method in FlightManager that uses a Binary Search to find a
    // Passenger by seat number. Remember to use the previous method to sort the list first
}
