import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Flight flight2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;
    private Plane plane2;


    @Before
    public void setUp() {
        passenger1 = new Passenger("Amos Burton", 2);
        passenger2 = new Passenger("Naomi Nagata", 1);
        passenger3 = new Passenger("James Holden", 1);
        plane = new Plane(PlaneType.SMALLPLANE);
        plane2 = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FJ012", "TYC", "CER", "2120");
        flight2 = new Flight(plane2, "EF678", "TYC", "CER", "1220");
    }


    @Test
    public void flightHasFlightNumber() {
        assertEquals("FJ012", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("TYC", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("CER", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("2120", flight.getDepartureTime());
    }

    @Test
    public void flightStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassengersToFlight() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        assertEquals(3, flight2.passengerCount());
    }

    @Test
    public void cantAddPassengersToFullFlight() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void canCheckAvailableSeats() {
        assertEquals(2, flight.checkAvailableSeats());
    }

    @Test
    public void showsNoAvailableSeats() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(0, flight.checkAvailableSeats());
    }

}
