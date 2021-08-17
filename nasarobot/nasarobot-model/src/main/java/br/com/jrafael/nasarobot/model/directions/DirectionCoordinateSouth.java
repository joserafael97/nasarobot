package br.com.jrafael.nasarobot.model.directions;

import br.com.jrafael.nasarobot.model.enums.Direction;
import br.com.jrafael.nasarobot.model.Robot;

public class DirectionCoordinateSouth implements DirectionCoordinate{

    @Override
    public void calculateCoordinate(Robot robot) {
        if (robot.getDirection().equals(Direction.S)) {
            robot.setCoordinateY(robot.getCoordinateY()  - 1);
        }
    }
}
