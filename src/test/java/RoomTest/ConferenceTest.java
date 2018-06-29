package RoomTest;

import Hotel.Guest;
import Hotel.Room.Conference;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference;

    @Before
    public void before(){
        conference = new Conference(100,"Balmoral", 1200.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conference.getCapacity(), 0);
    }

    @Test
    public void hasName(){
        assertEquals("Balmoral", conference.getName());
    }

    @Test
    public void hasRate() {
        assertEquals(1200.00, conference.getRate(), 0.01);
    }

}
