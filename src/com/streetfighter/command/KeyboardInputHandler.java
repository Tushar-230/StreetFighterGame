package com.streetfighter.command;

import com.streetfighter.fighter.Fighter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * Listens for real key presses and looks up the matching Command object.
 * Extend KeyAdapter so we only need to override keyPressed (not the
 * other KeyListener methods we don't care about).
 */
public class KeyboardInputHandler extends KeyAdapter {

    private Map<Integer, InputCommand> keyBindings = new HashMap<>();

    public KeyboardInputHandler(Fighter fighter) {
        // J = punch, K = block  (change these key codes any time —
        // that's the whole benefit of Command: rebinding is just a map edit)
        keyBindings.put(KeyEvent.VK_J, new PunchCommand(fighter));
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
