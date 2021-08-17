package br.com.jrafael.nasarobot.model.commands;

import br.com.jrafael.nasarobot.model.Robot;
import br.com.jrafael.nasarobot.model.enums.Direction;
import br.com.jrafael.nasarobot.model.rotation.*;

import java.util.ArrayList;
import java.util.List;

public class RightCommand implements Command {

    @Override
    public void execute(Robot robot) {
        getAllRigthRotations().stream().anyMatch(rotationRobot -> {
            Direction currentDirection = robot.getDirection();
            currentDirection = rotationRobot.changeRotation(currentDirection);
            if (!currentDirection.equals(robot.getDirection())) {
                robot.setDirection(currentDirection);
                return true;
            }
            return false;
        });

    }

    private List<RotationRobot> getAllRigthRotations() {
        List<RotationRobot> rotations = new ArrayList<>();
        rotations.add(new RotationRightNorth());
        rotations.add(new RotationRigthSouth());
        rotations.add(new RotationRigthEast());
        rotations.add(new RotationRigthWest());
        return rotations;
    }
}
