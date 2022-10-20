package swing;

import javax.swing.*;

public class Window {
    JPanel jPanel = new JPanel();
    JFrame mainWindow;
    public Window(String windowName) {
        mainWindow = new JFrame(windowName);
        mainWindow.pack();
//        jPanel.setBackground(Color.black);
        mainWindow.setContentPane(jPanel);
        mainWindow.setSize(400, 400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
    }

}
