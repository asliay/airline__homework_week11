import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Amos Burton", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Amos Burton", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger.getBagCount());
    }
}
