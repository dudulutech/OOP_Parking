package org.example;

public class ParkingSlot {
    public int row;
    public int col;
    public int level;
    public Car carOccupayingSlot;

    public ParkingSlot(int row, int col, int level, Car carOccupayingSlot) {
        this.row = row;
        this.col = col;
        this.level = level;
        this.carOccupayingSlot = carOccupayingSlot;
    }
}
