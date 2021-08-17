package br.com.jrafael.nasarobot.model.rotation;

import br.com.jrafael.nasarobot.model.enums.Direction;

public class RotationRigthSouth implements RotationRobot {
    @Override
    public Direction changeRotation(Direction direction) {
        if (direction.equals(Direction.S)) {
            return Direction.W;
        }
        return direction;
    }
}
