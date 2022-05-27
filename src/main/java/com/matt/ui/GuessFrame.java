package com.matt.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("Tips");
    JTextField number = new JTextField(8);
    Random random = new Random();
    int secret = random.nextInt(10)+1;


    public GuessFrame(){
        super();
        System.out.println("secret number: "+secret);
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                if(num > secret){
                    label.setText("smaller");
                } else if(num < secret){
                    label.setText("bigger");
                } else{
                    label.setText("bingo the secret number is "+secret);

                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);

    }



    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
