package br.com.jrafael.nasarobot.model.util.mapper;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.commands.MoveCommand;
import br.com.jrafael.nasarobot.model.enums.CommandEnum;

public class MoveCommandMapperUtil extends CommandMapperUtil{

    @Override
    public Command getCommand(String command) throws BusinessValidationException {
        if (command.equals(CommandEnum.M.name())){
            return new MoveCommand();
        }
        return callNext(command);
    }
}
