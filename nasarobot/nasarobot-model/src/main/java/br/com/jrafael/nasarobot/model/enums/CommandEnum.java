package br.com.jrafael.nasarobot.model.enums;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;

public enum CommandEnum {

    R("RIGHT", "R"), //rotaciona para direta 90º
    L("LEFT", "L"), //rotaciona para esquerda 90º
    M("MOVE", "M"); //move na posição atual

    private String description;
    private String enumAbbreviation;

    private CommandEnum(String description, String enumAbbreviation) {
        this.description = description;
        this.enumAbbreviation = enumAbbreviation;
    }

    public static CommandEnum getCommandEnumByString(String enumSigla) throws BusinessValidationException {
        for (CommandEnum commandEnum : CommandEnum.values()) {
            if (commandEnum.getEnumAbbreviation().equals(enumSigla)) {
                return commandEnum;
            }
        }
        throw new BusinessValidationException("Invalid commands.");
    }

    public String getDescription() {
        return description;
    }

    public String getEnumAbbreviation() {
        return enumAbbreviation;
    }

}
