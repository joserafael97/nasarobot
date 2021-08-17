package br.com.jrafael.nasarobot.model.directions;

import br.com.jrafael.nasarobot.model.Robot;
import br.com.jrafael.nasarobot.model.enums.Direction;

public class DirectionCoordinateEast implements DirectionCoordinate{

    @Override
    public void calculateCoordinate(Robot robot) {
        if (robot.getDirection().equals(Direction.E)) {
            robot.setCoordinateX(robot.getCoordinateX() + 1);
        }
    }
}
