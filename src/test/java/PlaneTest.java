import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.TESTPLANE);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.TESTPLANE, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(5, plane.getWeight());
    }
}
