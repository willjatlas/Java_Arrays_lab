import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrainStopTest {

    private TrainStop trainStop;
    private Passenger passenger1;

    @Before
    public void before(){
        trainStop  = new TrainStop("Falkirk");
        passenger1 = new Passenger();
    }

    @Test
    public void canAddPassenger(){
        trainStop.addPassenger(passenger1);
        assertEquals(1, trainStop.getQueueLength());
    }

    @Test
    public void canRemovePassenger(){
        trainStop.addPassenger(passenger1);
        trainStop.removePassenger();
        assertEquals(0, trainStop.getQueueLength());
    }

    @Test
    public void canClearQueue(){
        trainStop.addPassenger(passenger1);
        trainStop.clearQueue();
        assertEquals(0, trainStop.getQueueLength());
    }

}
