package com.streetfighter.command;

import com.streetfighter.fighter.Fighter;

public class PunchCommand implements InputCommand {

    private Fighter fighter;

    public PunchCommand(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public void execute() {
        fighter.pressAttack();
    }
}
