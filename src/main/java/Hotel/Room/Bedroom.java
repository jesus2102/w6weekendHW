package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int number;
    private BedroomType type;

    public Bedroom(int capacity, int number, BedroomType type){
        super(capacity);
        this.number = number;
        this.type = type;
    }

    public double getPrice() {
        return this.type.getValue();
    }
}
