package com.company;

import com.company.gui.GraphicsHandler;
import com.company.movement.BallMovementHandler;
import com.company.movement.EnemyMovementHandler;
import com.company.movement.PlayerMovementHandler;

public class Main {

    //Constructor
    public static void main(String[] args) {
        //Initialize classes
        new VarStore();
        new GraphicsHandler();
        new PlayerMovementHandler();
        new EnemyMovementHandler();
        new BallMovementHandler();
        new BallCollisionHandler();
    }
}
