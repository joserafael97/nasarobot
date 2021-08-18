package br.com.jrafael.nasarobot.model.util.mapper;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.commands.LeftCommand;
import br.com.jrafael.nasarobot.model.enums.CommandEnum;

public class LeftCommandMapperUtil extends CommandMapperUtil{

    @Override
    public Command getCommand(String command) throws BusinessValidationException {
        if (command.equals(CommandEnum.L.name())){
            return new LeftCommand();
        }
        return callNext(command);
    }
}
