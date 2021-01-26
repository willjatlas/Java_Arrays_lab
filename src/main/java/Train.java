import java.util.ArrayList;

public class Train {

    private String destination;
    private int maxCapacity;
    private ArrayList<Passenger> curPassengers;

    public Train(String destination, int maxCapacity){

        this.destination   = destination;
        this.maxCapacity   = maxCapacity;
        this.curPassengers = new ArrayList<>();

    }

    public int getCurPassengers(){
        return curPassengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(getCurPassengers() < maxCapacity){
            curPassengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger1) {
        curPassengers.remove(0);
    }

    public void addPassengerFromStop(TrainStop stop){
        Passenger output = stop.removePassenger();
        addPassenger(output);
    }
}
