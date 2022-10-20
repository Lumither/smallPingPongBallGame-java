//package swing;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class StartMenue extends Window {
//
//    public StartMenue(String windowName) {
//        super(windowName);
//    }
//
//    public void start() {
////        boolean gameMode = true;
//        JLabel text = new JLabel("Choose a Gamemode:");
//        mainWindow.add(text);
//
//        JButton singlePlayer = new JButton("single player");
//        JButton multiPlayer = new JButton("multi player");
//        mainWindow.repaint();
//
//        singlePlayer.addActionListener( new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("1");
//                Main.gamemode = 1;
//            }
//        });
//        multiPlayer.addActionListener( new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("2");
//                Main.gamemode = 2;
//            }
//        });
//
//        mainWindow.add(singlePlayer);
//        mainWindow.add(multiPlayer);
//        mainWindow.repaint();
//    }
//}
