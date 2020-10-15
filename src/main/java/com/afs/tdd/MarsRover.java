package com.afs.tdd;

import java.util.SortedMap;

public class MarsRover {

    private int xAxis;
    private int yAxis;
    private char direction;
    private String command;
    public static final char FORWARD = 'M';
    public static final char LEFT = 'L';
    public static final char NORTH = 'N';
    public static final char EAST = 'E';
    public static final char WEST = 'W';
    public static final char SOUTH = 'S';
    public static final char RIGHT = 'R';

    public MarsRover(int xAxis, int yAxis, char direction, String command) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.direction = direction;
        this.command = command;
    }

    public String executeCommand() {
        if(command.equals(String.valueOf(FORWARD))){
            moveForward();
        } else if(command.equals(String.valueOf(LEFT))){
            turnLeft();
        } else if(command.equals(String.valueOf(RIGHT))){
            turnRight();
        }
        return String.valueOf(xAxis) + String.valueOf(yAxis) + String.valueOf(direction);
    }

    private void turnRight() {
        if(direction == NORTH){
            direction = EAST;
        }else if(direction == SOUTH){
            direction = WEST;
        }
    }

    private void turnLeft() {
        if(direction == NORTH){
            direction = WEST;
        }else if(direction == SOUTH){
            direction = EAST;
        }
    }

    public void moveForward(){
        if(direction == NORTH){
            yAxis += 1;
        } else if(direction == SOUTH){
            yAxis -= 1;
        }
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public char getDirection() {
        return direction;
    }

    public String getCommand() {
        return command;
    }

}
