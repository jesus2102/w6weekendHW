package RoomTest;

import Hotel.Room.Dinningroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningroomTest {

    Dinningroom dinningroom;

    @Before
    public void before(){
        dinningroom = new Dinningroom(50, "Little China Restaurant");
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, dinningroom.getCapacity());
    }
}
