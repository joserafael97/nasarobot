package br.com.jrafael.nasarobot.model.commands;

import br.com.jrafael.nasarobot.model.Robot;

public interface Command {

    public void execute(Robot robot);
}
