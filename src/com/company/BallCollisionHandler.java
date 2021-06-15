package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class BallCollisionHandler {
    //Properties
    Timer movementTracker;

    //Constructor
    public BallCollisionHandler() {
        movementTracker = new Timer();
        movementTracker.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                //Bottom collision
                if(VarStore.yCoordinateOfBall + 50 >= VarStore.screenHeight) {
                    VarStore.yDirectionOfBall = -1;
                }

                //Upper side collision
                if(VarStore.yDirectionOfBall <= 0) {
                    VarStore.yDirectionOfBall = 1;
                }

                //Right side collision
                if(VarStore.xCoordinateOfBall >= VarStore.screenWidth) {
                    VarStore.playerScore += 1;

                    VarStore.xCoordinateOfBall = VarStore.screenWidth / 2 - 10;
                    VarStore.yCoordinateOfBall = VarStore.screenHeight / 2 - 10;

                    VarStore.xDirectionOfBall = -1;
                }

                //Left side collision
                if(VarStore.xCoordinateOfBall <= 0) {
                    VarStore.enemyScore += 1;

                    VarStore.xCoordinateOfBall = VarStore.screenWidth / 2 - 10;
                    VarStore.yCoordinateOfBall = VarStore.screenHeight / 2 - 10;

                    VarStore.xDirectionOfBall = 1;
                }
            }
        }, 0, 4);
    }
}
