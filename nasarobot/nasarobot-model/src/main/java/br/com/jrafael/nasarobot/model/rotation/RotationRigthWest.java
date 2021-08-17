package br.com.jrafael.nasarobot.model.rotation;

import br.com.jrafael.nasarobot.model.enums.Direction;

public class RotationRigthWest implements RotationRobot{

    @Override
    public Direction changeRotation(Direction direction) {
        if(direction.equals(Direction.W)){
            return Direction.N;
        }
        return direction;
    }
}
