package com.yango.hello;

import javax.swing.*;
import java.awt.*;

public class GreetingUI extends JFrame{
    private JTextField textField;

    public static void main(String[] args){
        GreetingUI frame = new GreetingUI();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        textField = new JTextField("Hello!");
        window.add(textField);
    }
}
