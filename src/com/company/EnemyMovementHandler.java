package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyMovementHandler {

    //Properties
    Timer movementTracker;

    //Constructor
    public EnemyMovementHandler() {
        movementTracker = new Timer();
        movementTracker.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if(VarStore.yCoordinateOfBall == VarStore.yCoordinateOfEnemy) {
                    //Do nothing
                }
                else if(VarStore.yCoordinateOfBall < VarStore.yCoordinateOfEnemy + 60) {
                    if(VarStore.yCoordinateOfEnemy >= 10) {
                        VarStore.yCoordinateOfEnemy -= 2;
                    }
                }
                else if(VarStore.yCoordinateOfBall > VarStore.yCoordinateOfEnemy + 60) {
                    if(VarStore.yCoordinateOfEnemy <= VarStore.screenHeight - 170) {
                        VarStore.yCoordinateOfEnemy += 2;
                    }
                }
            }
        }, 0, 4);

    }
}
