package com.company.gui;

import com.company.VarStore;

import javax.swing.*;
import java.awt.*;

public class DrawHandler extends JLabel {

    //Constructor
    public DrawHandler() {

    }

    //Methods
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        //Antialiasing
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Field
        graphics2D.setColor(Color.ORANGE);
        graphics2D.fillRect(0, 0, VarStore.screenWidth, VarStore.screenHeight);

        //Line
        graphics2D.setColor(Color.WHITE);
        for(int i = 0; i < 31; i++) {
            graphics2D.fillRect(VarStore.screenWidth/2 - 5, i * 25, 10, 10);
        }

        //Players
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillRect(VarStore.xCoordinateOfPlayer, VarStore.yCoordinateOfPlayer, 15, 120);
        graphics2D.fillRect(VarStore.xCoordinateOfEnemy, VarStore.yCoordinateOfEnemy, 15, 120);

        //Points
        graphics2D.setColor(Color.WHITE);
        graphics2D.setFont(VarStore.currentFont);
        graphics2D.drawString(String.valueOf(VarStore.playerScore), VarStore.screenWidth / 2 - 120, 540);
        graphics2D.drawString(String.valueOf(VarStore.enemyScore), VarStore.screenWidth / 2 + 65, 540);

        //Ball
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillRect(VarStore.xCoordinateOfBall, VarStore.yCoordinateOfBall, 20, 20);

        repaint();
    }
}
