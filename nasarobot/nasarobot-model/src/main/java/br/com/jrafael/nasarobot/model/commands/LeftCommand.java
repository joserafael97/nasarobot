package br.com.jrafael.nasarobot.model.commands;

import br.com.jrafael.nasarobot.model.enums.Direction;
import br.com.jrafael.nasarobot.model.Robot;
import br.com.jrafael.nasarobot.model.rotation.RotationLeftEast;
import br.com.jrafael.nasarobot.model.rotation.RotationLeftNorth;
import br.com.jrafael.nasarobot.model.rotation.RotationLeftWest;
import br.com.jrafael.nasarobot.model.rotation.RotationRobot;

import java.util.ArrayList;
import java.util.List;

public class LeftCommand implements Command{


    @Override
    public void execute(Robot robot) {
        getAllLeftRotations().stream().anyMatch(rotationRobot -> {
            Direction currentDirection = robot.getDirection();
            currentDirection = rotationRobot.changeRotation(currentDirection);
            if (!currentDirection.equals(robot.getDirection())) {
                robot.setDirection(currentDirection);
                return true;
            }
            return false;
        });
    }

    private List<RotationRobot> getAllLeftRotations() {
        List<RotationRobot> rotations = new ArrayList<>();
        rotations.add(new RotationLeftNorth());
        rotations.add(new RotationLeftNorth());
        rotations.add(new RotationLeftEast());
        rotations.add(new RotationLeftWest());
        return rotations;
    }
}
