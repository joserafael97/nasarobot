package br.com.jrafael.nasarobot.model.rotation;

import br.com.jrafael.nasarobot.model.enums.Direction;

public class RotationLeftEast implements RotationRobot {

    public Direction changeRotation(Direction direction) {
        if (direction.equals(Direction.E)) {
            return Direction.N;
        }

        return direction;
    }
}
