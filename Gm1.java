package swing;

import java.awt.event.KeyEvent;

public class Gm1 extends Window {
    Racket lR = new Racket(mainWindow, true);
    Racket rR = new Racket(mainWindow, false);
    Ball ball = new Ball(mainWindow);
    RacketController lcontroller = new RacketController(lR, KeyEvent.VK_Q, KeyEvent.VK_A);
    RacketController rcontroller = new RacketController(rR, KeyEvent.VK_P, KeyEvent.VK_L);
    BallController ballController = new BallController(ball);

    public Gm1(String name) {
        super(name);
        mainWindow.repaint();
        mainWindow.add(lcontroller);
        mainWindow.addKeyListener(lcontroller);
        mainWindow.add(rcontroller);
        mainWindow.addKeyListener(rcontroller);
    }

    public void run() {
        while(true){
            try {
                Thread.currentThread().sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            if (ballController.vector[0] > 0) {
                rcontroller.refresh();
//            } else {
                lcontroller.refresh();
//            }

            ballController.refresh(lR, rR);
            mainWindow.repaint();
        }
//            Thread.currentThread().sleep(100);
    }
}
