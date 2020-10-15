package com.afs.tdd;

import java.util.Arrays;
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

    public String executeCommand() throws CommandNotDefinedException{
        char[] checkIfMultipleCommands = command.toCharArray();
        if(checkIfMultipleCommands.length == 1){
            validateCommand(command);
        } else{
            for(char singleCommand :checkIfMultipleCommands) {
                validateCommand(String.valueOf(singleCommand));
            }
        }
        return String.valueOf(xAxis) + String.valueOf(yAxis) + String.valueOf(direction);

    }

    public void validateCommand(String singleCommand) throws CommandNotDefinedException {
        if(singleCommand.equals(String.valueOf(FORWARD))){
            moveForward();
        } else if(singleCommand.equals(String.valueOf(LEFT))){
            turnLeft();
        } else if(singleCommand.equals(String.valueOf(RIGHT))){
            turnRight();
        } else {throw new CommandNotDefinedException("Invalid command!");}
    }

    private void turnRight() {
        if(direction == NORTH){
            direction = EAST;
        }else if(direction == SOUTH){
            direction = WEST;
        }else if(direction == EAST){
            direction = SOUTH;
        }else if(direction == WEST){
            direction = NORTH;
        }
    }

    private void turnLeft() {
        if(direction == NORTH){
            direction = WEST;
        }else if(direction == SOUTH){
            direction = EAST;
        }else if(direction == EAST){
            direction = NORTH;
        }else if(direction == WEST){
            direction = SOUTH;
        }
    }

    public void moveForward(){
        if(direction == NORTH){
            yAxis += 1;
        }else if(direction == SOUTH){
            yAxis -= 1;
        }else if(direction == EAST){
            xAxis += 1;
        }else if(direction == WEST){
            xAxis -=1;
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
