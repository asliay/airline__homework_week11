public class Passenger {

    //Each passenger bag weighs the same
    //Planes reserve half of their total weight for passenger bags
    //The weight of bag per person is the weight reserved for passenger bags divided by the capacity
    //Passengers exist for a single flight only

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return this.name;
    }

    public int getBagCount() {
        return this.numberOfBags;
    }
}
