package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class VarStore {

    // Global properties
    public static JFrame mainFrame;
    public static int screenWidth = 800;
    public static int screenHeight = 600;

    public static boolean moveUp = false;
    public static boolean moveDown = false;

    public static int xCoordinateOfPlayer = 20;
    public static int yCoordinateOfPlayer = 225;
    public static int xCoordinateOfEnemy = 750;
    public static int yCoordinateOfEnemy = 225;
    public static int xCoordinateOfBall = screenWidth / 2; //starting point
    public static int yCoordinateOfBall = screenHeight / 2; //starting point
    public static int xDirectionOfBall = 1; //starting direction
    public static int yDirectionOfBall = -1; //starting direction

    public static int playerScore = 0;
    public static int enemyScore = 0;

    public static Font currentFont;

    //Constructor
    public VarStore() {
        //Font
        try {
            currentFont = Font.createFont(Font.TRUETYPE_FONT, new File("Gotham Bold.otf")).deriveFont(85f);
            GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicsEnv.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Gotham Bold.otf")));
        }
        catch (FontFormatException | IOException e ) {
            e.printStackTrace();
        }
    }
}
