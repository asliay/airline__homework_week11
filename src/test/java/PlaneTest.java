import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.SMALLPLANE);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.SMALLPLANE, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(40, plane.getWeight());
    }
}
