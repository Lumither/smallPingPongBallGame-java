package swing;

import java.util.Arrays;

public class BallController {
    int vector[] = new int[2];
    Ball ball;
    public BallController(Ball ball) {
        Arrays.fill(vector, (int) Math.random() * 5 + 3);
        this.ball = ball;
    }
    public void refresh(Racket lR, Racket rR) {
//        System.out.println("lol");
        ball.move(vector[0], vector[1]);
        int allowedError = Math.abs(vector[0]) - 2;
        if ((ball.x_cord <= 35 && ball.x_cord >= 30 - allowedError) && !((ball.y_cord > lR.y_cord + 60) || (ball.y_cord + 20 < lR.y_cord))) {
            vector[0] = Math.abs(vector[0]) + 1;

        }
        if ((ball.x_cord + 20 >= 365 && ball.x_cord + 20 <= 370 + allowedError) && !((ball.y_cord > rR.y_cord + 60) || (ball.y_cord + 20 < rR.y_cord))) {
            vector[0] = -Math.abs(vector[0]) - 1;
        }
        if (ball.y_cord > 360 || ball.y_cord < 0) {
            vector[1] = vector[1] > 0 ? -vector[1] - 1: -vector[1] + 1;
        }
        if (ball.x_cord < 0 || ball.x_cord > 400) {
            reset();
        }
    }

    public void reset() {
        ball.x_cord = 200;
        ball.y_cord = 200;
        ball.img.setBounds(200, 200, 15, 15);
        Arrays.fill(vector, (int) Math.random() * 5 + 3);
//        System.out.println("123");
    }
}
