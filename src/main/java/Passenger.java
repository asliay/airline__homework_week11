public class Passenger {

    //Each passenger bag weighs the same (15kg)
    //Planes reserve half of their total weight for passenger bags
    //The weight of bag per person is the weight reserved for passenger bags divided by the capacity
    //Passengers exist for a single flight only

    //MORE EXTENSIONS:
    // Add a 'flight' property to the Passenger class which is assigned
    //  when a passenger is added to a flight
    // Add a 'seat number' property to the Passenger class as an integer.
    // Set it to a random number which is assigned when a Passenger is booked on a flight
    // Make sure the flight doesn't double book the same seat number to more than one passenger

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
