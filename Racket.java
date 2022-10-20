package swing;

import javax.swing.*;

public class Racket {
    JLabel img;
    int x_cord, y_cord;
    public Racket(JFrame windows, boolean side) {
        img = new JLabel(new ImageIcon("img/box.png"));
        windows.add(img);
        x_cord = side ? 30 : 365;
        y_cord = 0;
        img.setBounds(x_cord, y_cord,5,60);
    }

    public void moveUp() {
        if (y_cord >= 10){
            y_cord -= 10;
            img.setBounds(x_cord, y_cord,5,60);
        }
    }
    public void moveDown() {
        if (y_cord <= 300){
            y_cord += 10;
            img.setBounds(x_cord, y_cord,5,60);
        }
    }

    public String toString() {
        return "Racket(" + x_cord + ", " + y_cord + ")";
    }
}
