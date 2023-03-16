package Task3;

import java.util.ArrayList;

// 3.d
public class Building {

    private final ArrayList<Room> rooms;

    private int numberOfBathrooms;

    private int numberOfFloors;

    private int isOfficeBuilding;

    // 3.e
    public Building(ArrayList<Room> rooms,int numberOfBathrooms,int numberOfFloors, int isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    // 3.f
    public final ArrayList<Room> getRooms(){
        return rooms;
    }
    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public int getIsOfficeBuilding(){
        return isOfficeBuilding;
    }


}
