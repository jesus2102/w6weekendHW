package Hotel;

import Hotel.Room.Bedroom;
import Hotel.Room.Room;
import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Collection;

public class Hotel {

    private ArrayList<Room> rooms;


    public Hotel(){
        this.rooms = new ArrayList<>();
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(Bedroom bedroom){
        this.rooms.remove(bedroom);
    }

    public void removeAllRooms(){
        this.rooms.clear();
    }

    public int getEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();

        for (int i = 0; i < numberOfRooms(); i++) {
            if (rooms.get(i).getNumberOfGuests() == 0) {
                emptyRooms.add(rooms.get(i));
            }
        }
        return emptyRooms.size();
    }

    public void addGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void removeGuest(Guest guest, Room room) {
        room.removeGuest(guest);
    }
}
