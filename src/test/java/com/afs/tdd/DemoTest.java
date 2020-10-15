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
        String command = String.valueOf('M');
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
        char direction = 'W';
        String command = String.valueOf('L');
        MarsRover marsRover = new MarsRover(xAxis, yAxis, direction, command);
        // when
        String actual = marsRover.executeCommand();

        // then
        assertEquals("00W",actual);
        
    }

}
