package woopich.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Frame extends JFrame{

    private int num = 1;
    private Random random = new Random();
    private int randNum = random.nextInt(20) + 1;
    private String string = "" + randNum;

    public Frame() {
        //******Создание объектов*****//
        Font font = new Font("Times new roman",Font.BOLD,30);
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("Угадай число");
        JTextField jTextField = new JTextField(10);
        jTextField.setFont(font);
        jTextField.setForeground(Color.red);
        //************Menu*************\\
        JMenu newMenu = new  JMenu("Color");
        JMenuBar jMenuBar = new JMenuBar();
        JMenuItem red = new JMenuItem("Red");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.red);
            }
        });
        JMenuItem blue = new JMenuItem("Blue");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.blue);
            }
        });
        JMenuItem green = new JMenuItem("Green");
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.green);
            }
        });
        JMenuItem cyan = new JMenuItem("Cyan");
        cyan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.cyan);
            }
        });
        JMenuItem black = new JMenuItem("Black");
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.black);
            }
        });
        newMenu.add(red);
        newMenu.add(blue);
        newMenu.add(green);
        newMenu.add(cyan);
        newMenu.add(black);
        jMenuBar.add(newMenu);
        setJMenuBar(jMenuBar);
        //**********************************\\
        JButton jButton = new JButton("Click on this shit!");
        JButton jButton1 = new JButton("Refresh");
        jButton1.setEnabled(false);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Logic.setLogic(jTextField, string, jLabel, num, jButton, jButton1);
               num++;
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = 1;
                jLabel.setText("Угадай число");
                jTextField.setText("");
                randNum = random.nextInt(20) + 1;
                string = "" + randNum;
                jButton.setEnabled(true);
                jButton1.setEnabled(false);
            }
        });
        //********Редактор окна*******//
        jPanel.setBackground(Color.lightGray);
        //*******Создание групп*******//
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        //********Горизонталь*********//
        layout.setHorizontalGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup()
                         .addComponent(jLabel)
                         .addComponent(jTextField)
                         .addComponent(jButton1)
                         .addComponent(jButton)));
        layout.linkSize(SwingConstants.HORIZONTAL, jTextField, jButton);
        layout.linkSize(SwingConstants.HORIZONTAL, jTextField, jButton1);
        //**********Вертикаль*********//
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(jLabel)
                .addComponent(jTextField)
                .addComponent(jButton)
                .addComponent(jButton1));
        //****************************//
        pack();
        //****************************//
    }
}
