package Hotel.Room;

public enum BedroomType {

    SINGLE(45.00),
    DOUBLE(80.00),
    SUIT(110.00),
    LUXURYSUIT(150.00),
    FAMILY(120.00);


    private final double value;

    BedroomType(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }
}
