package com.streetfighter.command;

import com.streetfighter.fighter.Fighter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyboardInputHandler extends KeyAdapter {

    private Map<Integer, InputCommand> keyBindings = new HashMap<>();

    public KeyboardInputHandler(Fighter fighter, Fighter target) {
        keyBindings.put(KeyEvent.VK_J, new PunchCommand(fighter, target));
        keyBindings.put(KeyEvent.VK_K, new BlockCommand(fighter));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        InputCommand command = keyBindings.get(e.getKeyCode());
        if (command != null) {
            command.execute();
        }
    }
}