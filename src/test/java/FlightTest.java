import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Amos Burton", 2);
        passenger2 = new Passenger("Naomi Nagata", 1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FJ012", "TYC", "CER", "2120");
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



}
