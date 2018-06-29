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
        conference = new Conference(100,"Balmoral", 12000.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conference.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Balmoral", conference.getName());
    }

}
