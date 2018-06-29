package Hotel;

import Hotel.Room.Bedroom;
import Hotel.Room.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;


    public Hotel(){
        this.rooms = new ArrayList<>();
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        this.rooms.add(bedroom);
    }

    public void removeRoom(Bedroom bedroom){
        this.rooms.remove(bedroom);
    }

    public void removeAllRooms(){
        this.rooms.clear();
    }
}
