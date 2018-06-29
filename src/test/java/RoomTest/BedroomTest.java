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
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Jonny");
        guest2 = new Guest("Adam");
        guest3 = new Guest("Rachel");
        bedroom = new Bedroom(5, 313, BedroomType.FAMILY);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, bedroom.getCapacity(), 0);
    }

    @Test
    public void canGetGuests(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canHavePrice(){
        assertEquals(120.00, bedroom.getPrice(), 0.00);
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        bedroom.removeGuest(guest2);
        assertEquals(2, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveAllGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        bedroom.removeAllGuest();
        assertEquals(0, bedroom.getNumberOfGuests(), 0);
    }
}
