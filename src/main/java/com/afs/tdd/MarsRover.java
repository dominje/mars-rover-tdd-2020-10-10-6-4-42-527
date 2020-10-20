package com.afs.tdd;

import com.afs.tdd.exception.CommandNotDefinedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover extends Coordinates {


    private Direction dir;

    public MarsRover(int xAxis, int yAxis, Direction direction) {
        super(xAxis, yAxis);
        this.dir = direction;
    }


    void turnRight() {
        switch (this.dir)
        {
            case NORTH: dir = Direction.valueOf("EAST"); break;
            case SOUTH: dir = Direction.valueOf("WEST"); break;
            case EAST: dir = Direction.valueOf("SOUTH"); break;
            case WEST:  dir = Direction.valueOf("NORTH"); break;
        }
    }

    void turnLeft() {
        switch (this.dir)
        {
            case NORTH: dir = Direction.valueOf("WEST"); break;
            case SOUTH: dir = Direction.valueOf("EAST"); break;
            case EAST:  dir = Direction.valueOf("NORTH"); break;
            case WEST:  dir = Direction.valueOf("SOUTH"); break;
        }
    }

    public void moveForward(){

        switch (this.dir)
        {
            case NORTH: yAxisIncreasePosition(); break;
            case SOUTH: yAxisDecreasePosition(); break;
            case EAST:  xAxisIncreasePosition(); break;
            case WEST:  xAxisDecreasePosition(); break;
        }
    }

    public char getDir() {
        return dir.toString().charAt(0);
    }


}
