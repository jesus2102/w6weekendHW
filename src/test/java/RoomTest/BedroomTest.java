package RoomTest;

import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.BedroomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jonny");
        bedroom = new Bedroom(1, 313, BedroomType.SINGLE);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }


    @Test
    public void canHavePrice(){
        assertEquals(45, bedroom.getPrice(), 0.00);
    }
}
