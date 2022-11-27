package org.example;

import java.util.List;

public class ParkingLot {
    public List<Level> levels;

    public ParkingLot(List<Level> levels) {
        this.levels = levels;
    }
    public boolean park(Car car){
        return true;
    }
}
