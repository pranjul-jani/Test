package elevator;

import java.util.Objects;

public class ElevatorService {

    Elevator elevator;

    public ElevatorService(Elevator elevator) {
        this.elevator = elevator;
    }

    public void goUp(Integer floorNumber) {

        if (elevator.getCurrentFloor() == elevator.getFloorList().size()) {
            // throw a custom error
            System.out.println("Invalid Input");
            return;
        }

        if (Objects.equals(elevator.getCurrentFloor(), floorNumber)) {
            System.out.println("Your lift is here");
            return;
        }

        elevator.addCommand(new Command(Type.UP, floorNumber));


    }

    public void goDown(Integer floorNumber) {
        if (elevator.getCurrentFloor() == 0) {
            // throw a custom error
            System.out.println("Invalid Input");
            return;

        }
    }


    public void goToSpecificFloor(Integer floorNumber) {
        if (floorNumber < 0 && floorNumber > elevator.getCurrentFloor()) {
            // throw a custom error
            System.out.println("Invalid Input");
            return;
        }
    }


}
