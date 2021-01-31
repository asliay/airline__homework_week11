import java.util.ArrayList;
import java.util.Collections;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Integer> seatNumbers;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        // list of seat numbers based on plane capacity, randomised
        this.seatNumbers = new ArrayList<>();
        int seatNumber = 1;
        while (seatNumbers.size() < this.getCapacity()){
            seatNumbers.add(seatNumber);
            seatNumber++;
        }
        Collections.shuffle(seatNumbers);
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public int getWeight() {
        return this.planeType.getWeight();
    }

    public ArrayList<Integer> getSeatNumbers() {
        return seatNumbers;
    }
}
