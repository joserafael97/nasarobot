package br.com.jrafael.nasarobot.model.directions;

import br.com.jrafael.nasarobot.model.enums.Direction;
import br.com.jrafael.nasarobot.model.Robot;

public class DirectionCoordinateNorth implements DirectionCoordinate{

    @Override
    public void calculateCoordinate(Robot robot) {
        if (robot.getDirection().equals(Direction.N)) {
            robot.setCoordinateY(robot.getCoordinateY() + 1);
        }
    }
}
