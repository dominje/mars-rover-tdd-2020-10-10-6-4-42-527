package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_x_0_y_1_direction_N_when_x_0_y_0_direction_N_given_command_M() {
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'N';
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("01N",actual);
    }

    @Test
    void should_return_x_0_y_0_direction_W_when_x_0_y_0_direction_N_given_command_L(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'N';
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00W",actual);
        
    }

    @Test
    void should_return_x_0_y_0_direction_E_when_x_0_y_0_direction_N_given_command_R(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'N';
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00E",actual);

    }

    @Test
    void should_return_x_0_y_negative1_direction_S_when_x_0_y_0_direction_S_given_command_M(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'S';
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("0-1S",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_E_when_x_0_y_0_direction_S_given_command_L(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'S';
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00E",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_W_when_x_0_y_0_direction_S_given_command_R(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'S';
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00W",actual);

    }

    @Test
    void should_return_x_1_y_0_direction_E_when_x_0_y_0_direction_E_given_command_M(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'E';
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("10E",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_N_when_x_0_y_0_direction_E_given_command_L(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'E';
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00N",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_S_when_x_0_y_0_direction_E_given_command_R(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'E';
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00S",actual);

    }

    @Test
    void should_return_x_negative1_y_0_direction_W_when_x_0_y_0_direction_W_given_command_M(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'W';
        String command = "M";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("-10W",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_S_when_x_0_y_0_direction_W_given_command_L(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'W';
        String command = "L";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00S",actual);

    }

    @Test
    void should_return_x_0_y_0_direction_N_when_x_0_y_0_direction_W_given_command_R(){
        // given
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'W';
        String command = "R";
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00N",actual);

    }

}
