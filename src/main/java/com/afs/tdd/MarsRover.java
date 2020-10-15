package com.afs.tdd;

public class MarsRover {

    private int xAxis;
    private int yAxis;
    private char direction;
    private String command;

    public MarsRover(int xAxis, int yAxis, char direction, String command) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.direction = direction;
        this.command = command;
    }

    public String executeCommand() {
        if(command.equals("M")){
            moveForward();
        } else if(command.equals("L")){
            turnLeft();
        }
        return String.valueOf(xAxis) + String.valueOf(yAxis) + direction;
    }

    private void turnLeft() {
        if(String.valueOf(direction).equals("N")){
            direction = 'W';
        }
    }

    public void moveForward(){
        if(String.valueOf(direction).equals("N")){
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
