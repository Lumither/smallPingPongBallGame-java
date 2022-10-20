package swing;

import javax.swing.*;

public class AutoRacketController extends JPanel {
    Racket racket;
    BallController ballController;

    public AutoRacketController(Racket racket, BallController ballController) {
        this.racket = racket;
        this.ballController = ballController;
    }

    public void refresh() {
        int goal_y = ballController.ball.y_cord - (ballController.ball.x_cord - 30) * ballController.vector[1] / ballController.vector[0];
//        System.out.println(goal_y + "->" + racket.y_cord);
        if (ballController.vector[0] < 0) {
            if ((Math.abs(racket.y_cord - goal_y + 30) >= 15)) {
                if (racket.y_cord + 30 < goal_y) {
                    racket.moveDown();
                } else {
                    racket.moveUp();
                }
            }
        }
    }


}
