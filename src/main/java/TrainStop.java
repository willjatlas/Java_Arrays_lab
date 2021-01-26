import java.util.ArrayList;

public class TrainStop {

    private String stopName;
    private ArrayList<Passenger> queue;

    public TrainStop(String stopName){
        this.stopName = stopName;
        this.queue    = new ArrayList<>();
    }

    public int getQueueLength(){
        return queue.size();
    }

    public void addPassenger(Passenger passenger){
        queue.add(passenger);
    }

    public Passenger removePassenger(){
        return queue.remove(0);
    }

    public void clearQueue(){ queue.clear(); }
}
