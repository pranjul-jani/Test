package elevator;

public class Command {
    private Type type;
    private Integer floorNumber;

    Command(Type type, Integer floorNumber) {
        this.type = type;
        this.floorNumber = floorNumber;
    }
}
