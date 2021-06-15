package com.company;

import javax.swing.*;

public class Gui {
    //Constructor
    public Gui() {
        //MainFrame
        VarStore.mainFrame = new JFrame();
        VarStore.mainFrame.setSize(VarStore.screenWidth, VarStore.screenHeight);
        VarStore.mainFrame.setTitle("Pong");
        VarStore.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VarStore.mainFrame.setLayout(null);
        VarStore.mainFrame.setResizable(false);
        VarStore.mainFrame.setVisible(true);
        VarStore.mainFrame.setLocationRelativeTo(null);
        VarStore.mainFrame.addKeyListener(new KeyHandler());
        VarStore.mainFrame.requestFocus();

        //Label (for drawing)
        DrawHandler drawHandler = new DrawHandler();
        drawHandler.setBounds(0, 0, VarStore.screenWidth, VarStore.screenHeight);
        drawHandler.setVisible(true);
        VarStore.mainFrame.add(drawHandler);


    }
}
