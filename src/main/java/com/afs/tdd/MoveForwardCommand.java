package com.afs.tdd;

public class MoveForwardCommand implements Command{

    MarsRover marsRover;

    public MoveForwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.moveForward();
    }

}
