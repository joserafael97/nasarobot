package br.com.jrafael.nasarobot.model.rotation;

import br.com.jrafael.nasarobot.model.enums.Direction;

public class RotationRigthEast implements RotationRobot {

    @Override
    public Direction changeRotation(Direction direction) {
        if (direction.equals(Direction.E)){
            return Direction.S;
        }
        return direction;
    }
}
