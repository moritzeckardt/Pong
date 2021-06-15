package com.company.movement;

import com.company.VarStore;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovementHandler {
    //Properties
    Timer movementTracker;

    //Constructor
    public BallMovementHandler() {
        movementTracker = new Timer();
        movementTracker.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                VarStore.xCoordinateOfBall += VarStore.xDirectionOfBall;
                VarStore.yCoordinateOfBall += VarStore.yDirectionOfBall;
            }
        }, 0, 2);
    }
}
