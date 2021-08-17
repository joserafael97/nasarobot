package br.com.jrafael.nasarobot.model;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.enums.Direction;
import br.com.jrafael.nasarobot.model.util.CommandUtil;

import java.util.List;

public class Robot {

    private Integer coordinateX;
    private Integer coordinateY;
    private Direction direction;

    public Robot(){
        coordinateX = 0;
        coordinateY = 0;
        direction = Direction.N;
    }

    public Robot sendCommandsByString(String command) throws BusinessValidationException {
        return this.sendCommands(CommandUtil.convertByString(command));
    }

    public Robot sendCommands(List<Command> commands) throws BusinessValidationException {
        for (Command command : commands) {
            command.execute(this);
        }
        if (this.getCoordinateX() > 5 || this.getCoordinateY() > 5) {
            throw new BusinessValidationException("Invalid coordinates.");
        } else {
           return this;
        }
    }

    //gets and setters
    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "("+coordinateX+", "+ coordinateY + ", " + direction+")";
    }
}
