package com.matt.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JButton button = new JButton("press me");
    JLabel label = new JLabel("ZZZZ");

    public GuessFrame(){
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hello");
                label.setText("hihihihi");
                button.setText("hello");

            }
        });

        setLayout(new FlowLayout());
        add(button);
        add(label);

    }



    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
