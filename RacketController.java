package swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RacketController extends JPanel implements KeyListener {
    Racket racket;
    private boolean status = false;

    int keyUP, keyDown;
    private KeyEvent e;
    public RacketController(Racket racket, int keyUP, int keyDown) {
        this.racket = racket;
        this.keyUP = keyUP;
        this.keyDown = keyDown;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == keyUP || e.getKeyCode() == keyDown) {
            this.e = e;
            status = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == keyUP || e.getKeyCode() == keyDown) {
            status = false;
        }
//        System.out.println("Release");
    }

    public void refresh() {
        if (status) {
            if (e.getKeyCode() == keyUP) {
                racket.moveUp();
            }
            if (e.getKeyCode() == keyDown) {
                racket.moveDown();
            }
        }
    }
}