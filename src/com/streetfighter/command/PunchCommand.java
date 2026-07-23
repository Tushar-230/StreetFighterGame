package com.streetfighter.command;

import com.streetfighter.fighter.Fighter;

public class PunchCommand implements InputCommand {

    private Fighter fighter;
    private Fighter target;

    public PunchCommand(Fighter fighter, Fighter target) {
        this.fighter = fighter;
        this.target = target;
    }

    @Override
    public void execute() {
        fighter.pressAttack(target);
    }
}