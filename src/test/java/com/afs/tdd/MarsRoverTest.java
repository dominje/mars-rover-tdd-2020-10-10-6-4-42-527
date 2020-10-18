package com.afs.tdd;

import com.afs.tdd.exception.CommandNotDefinedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    int xAxis = 0;
    int yAxis = 0;

    @Test
    void should_return_x_0_y_1_direction_N_when_x_0_y_0_direction_N_given_command_M() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("NORTH");
        String command = "M";

        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("01N",actual);
    }
    @Test
    void should_return_x_0_y_0_direction_W_when_x_0_y_0_direction_N_given_command_L() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("NORTH");
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00W",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_E_when_x_0_y_0_direction_N_given_command_R() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("NORTH");
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00E",actual);

    }

    @Test
    void should_return_x_0_y_negative1_direction_S_when_x_0_y_0_direction_S_given_command_M() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("SOUTH");
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("0-1S",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_E_when_x_0_y_0_direction_S_given_command_L() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("SOUTH");
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00E",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_W_when_x_0_y_0_direction_S_given_command_R() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("SOUTH");
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00W",actual);

    }

    @Test
    void should_return_x_1_y_0_direction_E_when_x_0_y_0_direction_E_given_command_M() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("EAST");
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("10E",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_N_when_x_0_y_0_direction_E_given_command_L() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("EAST");
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00N",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_S_when_x_0_y_0_direction_E_given_command_R() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("EAST");
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00S",actual);

    }

    @Test
    void should_return_x_negative1_y_0_direction_W_when_x_0_y_0_direction_W_given_command_M() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("WEST");
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("-10W",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_S_when_x_0_y_0_direction_W_given_command_L() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("WEST");
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00S",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_N_when_x_0_y_0_direction_W_given_command_R() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("WEST");
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("00N",actual);

    }

    @Test
    void should_throw_command_not_defined_exception_when_x_0_y_0_direction_N_given_command_F() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("NORTH");
        String command = "F";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when

        CommandNotDefinedException thrown = assertThrows(
                CommandNotDefinedException.class,
                () -> marsRover.executeCommand(command),
                "Expected marsRover() to throw, but it didn't"
        );

        // then
        assertTrue(thrown.getMessage().contains("Invalid command!"));

    }

    @Test
    void should_return_x_negative1_y_negative1_direction_N_when_x_0_y_0_direction_N_given_command_MLMR() throws CommandNotDefinedException {
        // given
        Direction direction = Direction.valueOf("NORTH");
        String command = "M,L,M,R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction);
        // when
        String actual = marsRover.executeCommand(command);

        // then
        assertEquals("-11N",actual);

    }
}
