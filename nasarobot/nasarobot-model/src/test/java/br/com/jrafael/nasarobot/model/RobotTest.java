package br.com.jrafael.nasarobot.model;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.enums.Direction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    private Robot robot;

    @BeforeEach
    public void setUp() {
        this.robot = new Robot();
    }

    @Test
    public void sendCommandMMRMMRMMTest() throws Exception {
        this.robot.sendCommandsByString("MMRMMRMM");
        assertEquals(2, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.S, this.robot.getDirection());
    }

    @Test
    public void sendCommandMMRMMMMRMMTest() throws Exception {
        this.robot.sendCommandsByString("MMRMMMMRMM");
        assertEquals(4, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.S, this.robot.getDirection());
    }

    @Test
    public void sendCommandWithLimitsAreaMMMMMRMMMMMTest() throws Exception {
        this.robot.sendCommandsByString("MMMMMRMMMMM");
        assertEquals(5, this.robot.getCoordinateX());
        assertEquals(5, this.robot.getCoordinateY());
        assertEquals(Direction.E, this.robot.getDirection());
    }

    @Test
    public void sendCommandWithInvalidsLimitsAreaMMMMMMRMMMMMMTest() throws Exception {
        assertThrows(BusinessValidationException.class, () -> {
            this.robot.sendCommandsByString("MMMMMMRMMMMMM");
        });
    }

    @Test
    public void sendCommandMMLTest() throws Exception {
        this.robot.sendCommandsByString("MML");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(2, this.robot.getCoordinateY());
        assertEquals(Direction.W, this.robot.getDirection());
    }

    @Test
    public void sendCommandMMRTest() throws Exception {
        this.robot.sendCommandsByString("MMR");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(2, this.robot.getCoordinateY());
        assertEquals(Direction.E, this.robot.getDirection());
    }

    @Test
    public void sendCommandInvalidCommandMMMMMMMMMMMMMMTest() throws Exception {
        assertThrows(BusinessValidationException.class, () -> {
            this.robot.sendCommandsByString("MMMMMMMMMMMMMM");
        });
    }

    @Test
    public void sendCommandCompleteRotationToNorthWithRRRRTest() throws Exception {
        this.robot.sendCommandsByString("RRRR");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.N, this.robot.getDirection());
    }

    @Test
    public void sendCommandWithRotationNorthToEastWithRTest() throws Exception {
        this.robot.sendCommandsByString("R");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.E, this.robot.getDirection());
    }

    @Test
    public void sendCommandWithRotationNorthToWestWithLTest() throws Exception {
        this.robot.sendCommandsByString("L");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.W, this.robot.getDirection());
    }

    @Test
    public void sendCommandWithRotationNorthToSouthWithRRTest() throws Exception {
        this.robot.sendCommandsByString("RR");
        assertEquals(0, this.robot.getCoordinateX());
        assertEquals(0, this.robot.getCoordinateY());
        assertEquals(Direction.S, this.robot.getDirection());
    }

}
