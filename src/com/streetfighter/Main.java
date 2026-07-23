package com.streetfighter;

import com.streetfighter.command.KeyboardInputHandler;
import com.streetfighter.gui.GamePanel;
import com.streetfighter.observer.HealthBarUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Street Fighter Game");
        GamePanel gamePanel = new GamePanel();

        // Hook up keyboard controls for Player 1 (Ryu) using J = punch, K = block
        KeyboardInputHandler p1Input = new KeyboardInputHandler(gamePanel.getPlayer1(), gamePanel.getPlayer2());
        gamePanel.addKeyListener(p1Input);

        // Observer: repaint the panel whenever health changes
        gamePanel.getPlayer1().addObserver((name, health) -> gamePanel.repaint());
        gamePanel.getPlayer2().addObserver((name, health) -> gamePanel.repaint());

        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        gamePanel.requestFocusInWindow(); // so key presses are captured immediately
    }
}