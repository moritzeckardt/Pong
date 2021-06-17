package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    //Methods
    @Override
    public void keyTyped(KeyEvent e) {
        //No need
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            VarStore.moveUp = true;
        }

        else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            VarStore.moveDown = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            VarStore.moveUp = false;
        }

        else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            VarStore.moveDown = false;
        }
    }
}
