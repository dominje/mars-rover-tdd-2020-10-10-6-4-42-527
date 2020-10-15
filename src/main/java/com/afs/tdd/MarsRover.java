package com.afs.tdd;

public class MarsRover {

    private int xAxis;
    private int yAxis;
    private char direction;
    private String command;
    public static final String FORWARD = "M";
    public static final String TURNLEFT = "L";
    public static final String NORTH = "N";

    public MarsRover(int xAxis, int yAxis, char direction, String command) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.direction = direction;
        this.command = command;
    }

    public String executeCommand() {
        if(command.equals(FORWARD)){
            moveForward();
        } else if(command.equals(TURNLEFT)){
            turnLeft();
        } else if(command.equals("R")){
            turnRight();
        }
        return String.valueOf(xAxis) + String.valueOf(yAxis) + direction;
    }

    private void turnRight() {
        if(String.valueOf(direction).equals(NORTH)){
            direction = 'E';
        }
    }

    private void turnLeft() {
        if(String.valueOf(direction).equals(NORTH)){
            direction = 'W';
        }
    }

    public void moveForward(){
        if(String.valueOf(direction).equals(NORTH)){
            yAxis += 1;
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
