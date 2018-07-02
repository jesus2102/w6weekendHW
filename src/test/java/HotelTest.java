import Hotel.Guest;
import Hotel.Hotel;
import Hotel.Room.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    Conference conference;

    Dinningroom dinningroom;

    @Before
    public void before(){
        hotel = new Hotel();

        guest1 = new Guest("Magda");
        guest2 = new Guest("Sarah");
        guest3 = new Guest("Kevin");
        guest4 = new Guest("Tim");
        guest5 = new Guest("Mary");

        bedroom1 = new Bedroom(2, 1, BedroomType.DOUBLE);
        bedroom2 = new Bedroom(1, 2, BedroomType.SINGLE);
        bedroom3 = new Bedroom(4, 3, BedroomType.FAMILY);
        bedroom4 = new Bedroom(2, 4, BedroomType.LUXURYSUIT);

        conference = new Conference(100,"Balmoral", 800.00);

        dinningroom = new Dinningroom(50, "Restaurant");

        bedroom1.addGuest(guest2);
        bedroom1.addGuest(guest3);
        bedroom4.addGuest(guest1);

        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
        hotel.addRoom(conference);
        hotel.addRoom(dinningroom);
    }


    @Test
    public void canCountRooms(){
        assertEquals(6, hotel.numberOfRooms());
    }

    @Test
    public void canAddRoom(){
        hotel.addRoom(bedroom1);
        assertEquals(7, hotel.numberOfRooms());

    }

    @Test
    public void canReturnNumberOfEmptyRooms(){
        assertEquals(2, hotel.getEmptyRooms());
    }

    @Test
    public void canCheckIn(){
        hotel.addGuest(guest4, bedroom2);
        assertEquals(1, bedroom2.getNumberOfGuests());
    }

    @Test
    public void canCheckOut(){
        hotel.addGuest(guest4, bedroom2);
        hotel.removeGuest(guest4, bedroom2);
        assertEquals(0, bedroom2.getNumberOfGuests());
    }
}
