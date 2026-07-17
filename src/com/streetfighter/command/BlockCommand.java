package com.streetfighter.command;

import com.streetfighter.fighter.Fighter;

public class BlockCommand implements InputCommand {

    private Fighter fighter;

    public BlockCommand(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public void execute() {
        fighter.pressBlock();
    }
}
