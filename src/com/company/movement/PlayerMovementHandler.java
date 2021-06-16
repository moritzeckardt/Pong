package com.company.movement;

import com.company.VarStore;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovementHandler {

    //Properties
    Timer movementTracker;

    //Constructor
    public PlayerMovementHandler() {
        movementTracker = new Timer();
        movementTracker.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if(VarStore.moveUp) {
                    if(VarStore.yCoordinateOfPlayer >= 10) {
                        VarStore.yCoordinateOfPlayer -= 2;
                    }
                }
                else if(VarStore.moveDown) {
                    if(VarStore.yCoordinateOfPlayer <= VarStore.screenHeight - 170) {
                        VarStore.yCoordinateOfPlayer += 2;
                    }
                }
            }
        }, 0, 4);
    }
}
