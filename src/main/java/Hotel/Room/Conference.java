package Hotel.Room;

public class Conference extends Room {

    private String name;
    private double rate;

    public Conference(int capacity, String name, double rate){
        super(capacity);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }
}
