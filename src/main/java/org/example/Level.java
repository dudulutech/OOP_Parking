package org.example;

import java.util.List;

public class Level {
    public int levelNumber;
    public int rows;
    public List<ParkingSlot> takenSlots;
    public int SPLOTS_PER_ROW = 2;

    public ParkingSlot findAvailableSpot(){
        return null;
    }

    public boolean park(Car car){
        return false;
    }

}
