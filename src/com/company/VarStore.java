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
    public static int yCoordinateOfPlayer = 185;
    public static int xCoordinateOfEnemy = 750;
    public static int yCoordinateOfEnemy = 185;

    public static int playerPoints = 0;
    public static int enemyPoints = 0;

    public static Font currentFont;

    //Constructor
    public VarStore() {
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
