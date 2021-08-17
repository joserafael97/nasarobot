package br.com.jrafael.nasarobot.model.util;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.commands.LeftCommand;
import br.com.jrafael.nasarobot.model.commands.MoveCommand;
import br.com.jrafael.nasarobot.model.commands.RightCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandUtil {

    public static List<Command> convertByString(String commandText) throws BusinessValidationException {
        List<Command> comands = new ArrayList<>();
        for (int i = 0; i < commandText.length(); i++) {
            if (commandText.substring(i, i + 1).equals("M")) {
                comands.add(new MoveCommand());
            } else if (commandText.substring(i, i + 1).equals("L")) {
                comands.add(new LeftCommand());
            } else if (commandText.substring(i, i + 1).equals("R")) {
                comands.add(new RightCommand());
            }else{
                throw new BusinessValidationException("Invalid commands.");
            }
        }
        return comands;
    }
}



