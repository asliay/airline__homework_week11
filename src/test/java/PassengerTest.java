import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Plane plane;
    private Flight flight;

    @Before
    public void setUp() {
        passenger = new Passenger("Amos Burton", 2);
        plane = new Plane(PlaneType.SMALLPLANE);
        flight = new Flight(plane, "FJ012", "TYC", "CER", "2120");
    }


    @Test
    public void hasName(){
        assertEquals("Amos Burton", passenger.getName());
    }

    @Test
    public void canSetName() {
        passenger.setName("James Holden");
        assertEquals("James Holden", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger.getBagCount());
    }

    @Test
    public void canSetNumberOfBags() {
        passenger.setNumberOfBags(3);
        assertEquals(3, passenger.getBagCount());
    }

    @Test
    public void canSetBookedFlight() {
        passenger.setBookedFlight(flight);
        assertEquals(flight, passenger.getBookedFlight());
    }
}
