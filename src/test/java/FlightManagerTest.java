import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight1;
    private Flight flight2;
    private FlightManager flightManager1;
    private FlightManager flightManager2;
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
        plane1 = new Plane(PlaneType.SMALLPLANE); // capacity 2 weight 40
        plane2 = new Plane(PlaneType.BOEING747); // capacity 20 weight 800
        flight1 = new Flight(plane1, "FJ012", "TYC", "CER", "2120");
        flight2 = new Flight(plane2, "FJ012", "TYC", "CER", "2120");
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        flightManager1 = new FlightManager(flight1);
        flightManager2 = new FlightManager(flight2); // 3 passengers, 4 bags
    }

    @Test
    public void canGetTotalWeightReservedForBaggage() {
        assertEquals(400, flightManager2.getFlightBaggageWeight());
    }

    @Test
    public void canGetIndividualBagWeightAllowance() {
        int result = flightManager2.getBaggageWeightAllowance();
        assertEquals(20, result);
    }

    @Test
    public void canCalculatePassengerBaggageWeight(){
        int result = flightManager2.getPassengerBaggageWeight(passenger1);
        assertEquals(40, result);
    }

    @Test
    public void canCalculateBookedWeight() {
        assertEquals(80, flightManager2.getBookedBaggageWeight());
    }


    @Test
    public void canCalculateRemainingBaggageAllowance() {
        assertEquals(320, flightManager2.remainingWeightAllowance());
    }

    // Super Extensions
    // Write a method in FlightManager that uses a Binary Search to find a
    // Passenger by seat number. Remember to use the previous method to sort the list first
}
