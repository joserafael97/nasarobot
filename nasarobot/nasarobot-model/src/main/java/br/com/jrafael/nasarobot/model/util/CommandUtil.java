package br.com.jrafael.nasarobot.model.util;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.util.mapper.CommandMapperUtil;
import br.com.jrafael.nasarobot.model.util.mapper.LeftCommandMapperUtil;
import br.com.jrafael.nasarobot.model.util.mapper.MoveCommandMapperUtil;
import br.com.jrafael.nasarobot.model.util.mapper.RigthCommandMapperUtil;

import java.util.ArrayList;
import java.util.List;

public class CommandUtil {

    public static List<Command> convertByString(String commandText) throws BusinessValidationException {

        List<Command> comands = new ArrayList<>();

        CommandMapperUtil moveCommandMapperUtil = new MoveCommandMapperUtil();
        CommandMapperUtil rigthCommandMapperUtil = new RigthCommandMapperUtil();
        CommandMapperUtil leftCommandMapperUtil = new LeftCommandMapperUtil();

        moveCommandMapperUtil.setNextCommandMapperUtil(rigthCommandMapperUtil);
        rigthCommandMapperUtil.setNextCommandMapperUtil(leftCommandMapperUtil);

        for (int i = 0; i < commandText.length(); i++) {
            Command command = moveCommandMapperUtil.getCommand(commandText.substring(i, i + 1));
            comands.add(command);
        }
        return comands;
    }
}



