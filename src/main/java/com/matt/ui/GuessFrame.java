package com.matt.ui;

import com.sun.source.tree.WhileLoopTree;

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
            int times = 0;
            public void actionPerformed(ActionEvent actionEvent) {

                int num = Integer.parseInt(number.getText());
                if(num > secret){
                    times += 1;
                    label.setText("smaller"+" you guess "+ times +" times");

                } else if(num < secret){
                    times += 1;
                    label.setText("bigger"+" you guess "+ times +" times");

                } else{
                    times += 1;
                    label.setText("bingo the secret number is "+secret+" you guess "+ times +" times");
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
