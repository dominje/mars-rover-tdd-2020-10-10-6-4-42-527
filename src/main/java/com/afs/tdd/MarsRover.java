package com.afs.tdd;

public class MarsRover {

    private int xAxis;
    private int yAxis;
    private char direction;
    private String command;
    public static final String FORWARD = "M";
    public static final String LEFT = "L";
    public static final String NORTH = "N";
    public static final char EAST = 'E';
    public static final char WEST = 'W';
    public static final String SOUTH = "S";

    public MarsRover(int xAxis, int yAxis, char direction, String command) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.direction = direction;
        this.command = command;
    }

    public String executeCommand() {
        if(command.equals(FORWARD)){
            moveForward();
        } else if(command.equals(LEFT)){
            turnLeft();
        } else if(command.equals("R")){
            turnRight();
        }
        return String.valueOf(xAxis) + String.valueOf(yAxis) + direction;
    }

    private void turnRight() {
        if(String.valueOf(direction).equals(NORTH)){
            direction = EAST;
        }
    }

    private void turnLeft() {
        if(String.valueOf(direction).equals(NORTH)){
            direction = WEST;
        }else if(String.valueOf(direction).equals("S")){
            direction = EAST;
        }
    }

    public void moveForward(){
        if(String.valueOf(direction).equals(NORTH)){
            yAxis += 1;
        } else if(String.valueOf(direction).equals(SOUTH)){
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
