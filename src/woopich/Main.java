package woopich;

import woopich.GUI.Frame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frame frame = new Frame();
                frame.setTitle("BAZINGA!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

    }
}
