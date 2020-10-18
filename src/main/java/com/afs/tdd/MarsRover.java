package com.afs.tdd;

import com.afs.tdd.exception.CommandNotDefinedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover extends Coordinates {

    public static final char FORWARD = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    private Direction dir;

    public MarsRover(int xAxis, int yAxis, Direction direction) {
        super(xAxis, yAxis);
        this.dir = direction;
    }

    public String executeCommand(String command) throws CommandNotDefinedException {

     Arrays.stream(command.split(",")).filter(s -> {
         validateCommand(s);
         return Boolean.parseBoolean(s);
     }).collect(Collectors.toList());

        return String.valueOf(getxAxis()) + String.valueOf(getyAxis()) + dir.toString().charAt(0);
    }

    public void validateCommand(String singleCommand)  {
        if(singleCommand.equals(String.valueOf(FORWARD))){
            moveForward(dir);
        } else if(singleCommand.equals(String.valueOf(LEFT))){
            turnLeft(dir);
        } else if(singleCommand.equals(String.valueOf(RIGHT))){
            turnRight(dir);
        } else {throw new CommandNotDefinedException("Invalid command!");}

    }

    private void turnRight(Direction checkDirection) {
        switch (checkDirection)
        {
            case NORTH: dir = Direction.valueOf("EAST"); break;
            case SOUTH: dir = Direction.valueOf("WEST"); break;
            case EAST: dir = Direction.valueOf("SOUTH"); break;
            case WEST:  dir = Direction.valueOf("NORTH"); break;
        }
    }

    private void turnLeft(Direction checkDirection) {
        switch (checkDirection)
        {
            case NORTH: dir = Direction.valueOf("WEST"); break;
            case SOUTH: dir = Direction.valueOf("EAST"); break;
            case EAST:  dir = Direction.valueOf("NORTH"); break;
            case WEST:  dir = Direction.valueOf("SOUTH"); break;
        }
    }

    public void moveForward(Direction checkDirection){

        switch (checkDirection)
        {
            case NORTH: yAxisIncreasePosition(); break;
            case SOUTH: yAxisDecreasePosition(); break;
            case EAST:  xAxisIncreasePosition(); break;
            case WEST:  xAxisDecreasePosition(); break;
        }
    }

}
