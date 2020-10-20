package com.afs.tdd;

import com.afs.tdd.exception.CommandNotDefinedException;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Client {

    MarsRover marsRover;
    public static final char FORWARD = 'M';
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    MoveForwardCommand moveForwardCommand;
    TurnLeftCommand turnLeftCommand;
    TurnRightCommand turnRightCommand;


    public Client(MarsRover marsRover) {
        this.marsRover = marsRover;
        this.moveForwardCommand = new MoveForwardCommand(marsRover);
        this.turnLeftCommand = new TurnLeftCommand(marsRover);
        this.turnRightCommand = new TurnRightCommand(marsRover);
    }

    public String executeCommand(String command) throws CommandNotDefinedException {

        Arrays.stream(command.split(",")).filter(s -> {
            validateCommand(s);
            return Boolean.parseBoolean(s);
        }).collect(Collectors.toList());

        return String.valueOf(marsRover.getxAxis()) + marsRover.getyAxis() + marsRover.getDir();
    }

    public void validateCommand(String singleCommand)  {

        if(singleCommand.equals(String.valueOf(FORWARD))){
            this.moveForwardCommand.execute();
        } else if(singleCommand.equals(String.valueOf(LEFT))){
            this.turnLeftCommand.execute();
        } else if(singleCommand.equals(String.valueOf(RIGHT))){
            this.turnRightCommand.execute();
        } else {throw new CommandNotDefinedException("Invalid command!");}

    }
}
