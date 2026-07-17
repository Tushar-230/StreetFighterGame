package com.streetfighter;

import com.streetfighter.command.KeyboardInputHandler;
import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fighter ryu = FighterFactory.createFighter(FighterFactory.FighterType.RYU);

        JFrame frame = new JFrame("Command Pattern Test");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KeyboardInputHandler inputHandler = new KeyboardInputHandler(ryu);
        frame.addKeyListener(inputHandler);
        frame.setFocusable(true);

        frame.setVisible(true);

        System.out.println("Window open — click on it, then press J or K. Check console for output.");
    }
}