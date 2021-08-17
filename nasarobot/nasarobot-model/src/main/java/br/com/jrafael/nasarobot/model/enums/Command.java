package br.com.jrafael.nasarobot.model.enums;

public enum Command {

    R("RIGHT", "R"), //rotaciona para direta 90º
    L("LEFT", "L"), //rotaciona para esquerda 90º
    M("MOVE", "M"); //move na posição atual

    private String description;
    private String enumAbbreviation;

    private Command(String description, String enumAbbreviation) {
        this.description = description;
        this.enumAbbreviation = enumAbbreviation;
    }
}
