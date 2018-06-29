package Hotel.Room;

public class Dinningroom extends Room{

    private String name;

    public Dinningroom(int capacity, String name){
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
