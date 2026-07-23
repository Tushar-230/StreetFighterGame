package com.streetfighter.gui;

import com.streetfighter.factory.FighterFactory;
import com.streetfighter.fighter.Fighter;
import com.streetfighter.command.KeyboardInputHandler;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Fighter player1;
    private Fighter player2;

    public GamePanel() {
        player1 = FighterFactory.createFighter(FighterFactory.FighterType.RYU);
        player2 = FighterFactory.createFighter(FighterFactory.FighterType.CHUN_LI);

        setPreferredSize(new Dimension(800, 400));
        setBackground(Color.DARK_GRAY);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Player 1 (Ryu) - blue rectangle on the left
        g.setColor(Color.BLUE);
        g.fillRect(100, 200, 60, 120);
        g.setColor(Color.WHITE);
        g.drawString(player1.getName() + " [" + player1.getCurrentStateName() + "]", 80, 190);
        drawHealthBar(g, 60, 160, player1.getHealth());

        // Player 2 (Chun-Li) - red rectangle on the right
        g.setColor(Color.RED);
        g.fillRect(640, 200, 60, 120);
        g.setColor(Color.WHITE);
        g.drawString(player2.getName() + " [" + player2.getCurrentStateName() + "]", 620, 190);
        drawHealthBar(g, 600, 160, player2.getHealth());
    }

    private void drawHealthBar(Graphics g, int x, int y, int health) {
        int barWidth = 150;
        int barHeight = 15;

        g.setColor(Color.BLACK);
        g.drawRect(x, y, barWidth, barHeight);

        g.setColor(Color.GREEN);
        int filledWidth = (int) (barWidth * (health / 100.0));
        g.fillRect(x, y, filledWidth, barHeight);
    }

    public Fighter getPlayer1() {
        return player1;
    }

    public Fighter getPlayer2() {
        return player2;
    }
}