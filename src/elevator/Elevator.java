package elevator;

import java.util.*;

public class Elevator {

    private String id;
    private List<Integer> floorList;
    private Status status;
    private Integer currentFloor;
    private List<Command> commandQueue;


    Elevator() {
        this.commandQueue = new LinkedList<>();
        this.currentFloor = 0;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Integer> floorList) {
        this.floorList = floorList;
    }

    public void addCommand(Command command) {
        commandQueue.add(command);
    }
}
