package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_x_0_y_1_direction_N_when_x_0_y_0_direction_N_given_command_M() {
        // given
        MarsRover marsRover = new MarsRover();
        int xAxis = 0;
        int yAxis = 0;
        char direction = 'N';
        char command = 'M';
        // when
        String actual = marsRover.executeCommand(xAxis, yAxis, direction, command);

        // then
        assertEquals("01N",actual);
    }
}
