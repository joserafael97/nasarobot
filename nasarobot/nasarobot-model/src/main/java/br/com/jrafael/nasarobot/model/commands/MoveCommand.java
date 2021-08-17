package br.com.jrafael.nasarobot.model.commands;

import br.com.jrafael.nasarobot.model.Robot;
import br.com.jrafael.nasarobot.model.directions.*;

import java.util.ArrayList;
import java.util.List;

public class MoveCommand implements Command{

    @Override
    public void execute(Robot robot) {
        getAllDirectionCoordinate()
                .forEach(directionCoordinate ->  directionCoordinate.calculateCoordinate(robot));
    }

    private List<DirectionCoordinate> getAllDirectionCoordinate() {
        List<DirectionCoordinate> directions = new ArrayList<>();
        directions.add(new DirectionCoordinateNorth());
        directions.add(new DirectionCoordinateSouth());
        directions.add(new DirectionCoordinateEast());
        directions.add(new DirectionCoordinateWest());
        return directions;
    }

}


