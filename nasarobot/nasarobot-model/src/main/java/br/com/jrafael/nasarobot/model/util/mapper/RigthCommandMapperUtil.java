package br.com.jrafael.nasarobot.model.util.mapper;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;
import br.com.jrafael.nasarobot.model.commands.RightCommand;
import br.com.jrafael.nasarobot.model.enums.CommandEnum;

public class RigthCommandMapperUtil extends CommandMapperUtil{

    @Override
    public Command getCommand(String command) throws BusinessValidationException {
        if (command.equals(CommandEnum.R.name())){
            return new RightCommand();
        }
        return callNext(command);
    }
}
