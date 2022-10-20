package swing;

import javax.swing.*;

public class Ball {
    JLabel img;
    int x_cord, y_cord;
    public Ball(JFrame windows) {
        img = new JLabel(new ImageIcon("img/ball.png"));
        x_cord = 200;
        y_cord = 200;
        img.setBounds(x_cord, y_cord,15,15);
        windows.add(img);
    }

    public void move(int dx, int dy) {
        x_cord += dx;
        y_cord += dy;
        img.setBounds(x_cord, y_cord,15,15);
    }

    public String toString() {
        return "Ball(" + x_cord + ", " + y_cord + ")";
    }
}
