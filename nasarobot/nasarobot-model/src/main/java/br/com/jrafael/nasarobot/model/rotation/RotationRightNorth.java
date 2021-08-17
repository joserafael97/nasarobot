package br.com.jrafael.nasarobot.model.rotation;

import br.com.jrafael.nasarobot.model.enums.Direction;

public class RotationRightNorth implements RotationRobot {

    @Override
    public Direction changeRotation(Direction direction) {
        if (direction.equals(Direction.N)) {
            return Direction.E;
        }
        return direction;
    }
}
