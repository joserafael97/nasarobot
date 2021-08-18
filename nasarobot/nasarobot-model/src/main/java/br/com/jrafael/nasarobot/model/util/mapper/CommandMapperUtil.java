package br.com.jrafael.nasarobot.model.util.mapper;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.commands.Command;

public abstract class CommandMapperUtil {

    CommandMapperUtil nexCommand;

    public void setNextCommandMapperUtil(CommandMapperUtil nexCommand) {
        this.nexCommand = nexCommand;
    }

    public abstract Command getCommand(String command) throws BusinessValidationException;

    protected Command callNext(String command) throws BusinessValidationException {
        if (this.nexCommand != null) {
            return this.nexCommand.getCommand(command);
        }
        throw new BusinessValidationException("Invalid commands.");
    }

}
