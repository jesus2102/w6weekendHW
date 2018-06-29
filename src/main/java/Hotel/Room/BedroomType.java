package Hotel.Room;

public enum BedroomType {

    SINGLE(45),
    DOUBLE(80),
    SUIT(110),
    LUXURYSUIT(150),
    FAMILY(120);


    private final int value;

    BedroomType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
