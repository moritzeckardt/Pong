package com.company;

import com.company.VarStore;

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
                if(VarStore.yCoordinateOfBall <= 0) {
                    VarStore.yDirectionOfBall = 1;
                }

                //Right side collision
                if(VarStore.xCoordinateOfBall + 20 >= VarStore.screenWidth) {
                    VarStore.playerScore += 1;

                    VarStore.xCoordinateOfBall = VarStore.screenWidth / 2 - 10;
                    VarStore.yCoordinateOfBall = VarStore.screenHeight / 2 - 10;

                    VarStore.xDirectionOfBall = -1;
                    VarStore.yDirectionOfBall = -1;
                }

                //Left side collision
                if(VarStore.xCoordinateOfBall <= 0) {
                    VarStore.enemyScore += 1;

                    VarStore.xCoordinateOfBall = VarStore.screenWidth / 2 - 10;
                    VarStore.yCoordinateOfBall = VarStore.screenHeight / 2 - 10;

                    VarStore.xDirectionOfBall = 1;
                    VarStore.yDirectionOfBall = -1;
                }

                //Player collision
                if (VarStore.xCoordinateOfBall < VarStore.xCoordinateOfPlayer + 15 && VarStore.xCoordinateOfBall > VarStore.xCoordinateOfPlayer &&
                        VarStore.yCoordinateOfBall - 20 < VarStore.yCoordinateOfPlayer + 120 && VarStore.yCoordinateOfBall > VarStore.yCoordinateOfPlayer) {
                    VarStore.xDirectionOfBall = 1;
                }

                //Enemy collision
                if (VarStore.xCoordinateOfBall < VarStore.xCoordinateOfEnemy && VarStore.xCoordinateOfBall > VarStore.xCoordinateOfEnemy -20 &&
                        VarStore.yCoordinateOfBall - 20 < VarStore.yCoordinateOfEnemy + 120 && VarStore.yCoordinateOfBall > VarStore.yCoordinateOfEnemy) {
                    VarStore.xDirectionOfBall = -1;
                }
            }
        }, 0, 3);
    }
}
