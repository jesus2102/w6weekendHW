package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity){
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public void removeAllGuest(){
        this.guests.clear();
    }

}
