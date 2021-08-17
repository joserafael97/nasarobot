package br.com.jrafael.nasarobot.model.enums;

public enum Direction {

    W("WEST", "W"),
    E("EAST", "E"),
    N("NORTH", "N"),
    S("SOUTH", "S");

    private String description;
    private String enumAbbreviation;

    private Direction(String description, String enumAbbreviation) {
        this.description = description;
        this.enumAbbreviation = enumAbbreviation;
    }

}
