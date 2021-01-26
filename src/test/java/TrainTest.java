import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrainTest {

    private Train train;
    private Passenger passenger1;
    private TrainStop falkirk;

    @Before
    public void before(){
        this.train      = new Train("Edinburgh", 20);
        this.passenger1 = new Passenger();
        this.falkirk    = new TrainStop("Falkirk");
    }

    @Test
    public void canCheckCurPassengers(){
        assertEquals(0, train.getCurPassengers());
    }

    @Test
    public void canAddPassenger(){
        train.addPassenger(passenger1);
        assertEquals(1, train.getCurPassengers());
    }

    @Test
    public void canRemovePassenger(){
        train.addPassenger(passenger1);
        train.removePassenger(passenger1);
        assertEquals(0, train.getCurPassengers());
    }

    @Test
    public void canAddPassengerFromStop(){
        falkirk.addPassenger(passenger1);
        train.addPassengerFromStop(falkirk);
        falkirk.clearQueue();
        assertEquals(1, train.getCurPassengers());

    }


}
