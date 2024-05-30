package GUI;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.*;
import java.awt.*;

public class font {


        public static void main(String[] args) {
            JFrame frame = new JFrame("Font Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(10, 1));


            JLabel label1 = new JLabel("Arial, Plain, 18");
            label1.setFont(new Font("Arial", Font.PLAIN, 18));
            frame.add(label1);

            JLabel label2 = new JLabel("Courier New, Italic, 15");
            label2.setFont(new Font("Courier New", Font.ITALIC, 15));
            frame.add(label2);

            JLabel label3 = new JLabel("Times New Roman, Bold, 20");
            label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
            frame.add(label3);

            JLabel label4 = new JLabel("Verdana, Plain, 16");
            label4.setFont(new Font("Verdana", Font.PLAIN, 16));
            frame.add(label4);

            JLabel label5 = new JLabel("Georgia, Bold Italic, 14");
            label5.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
            frame.add(label5);

            JLabel label6 = new JLabel("Helvetica, Plain, 18");
            label6.setFont(new Font("Helvetica", Font.PLAIN, 18));
            frame.add(label6);

            JLabel label7 = new JLabel("SansSerif, Bold, 22");
            label7.setFont(new Font("SansSerif", Font.BOLD, 22));
            frame.add(label7);

            JLabel label8 = new JLabel("Monospaced, Italic, 20");
            label8.setFont(new Font("Monospaced", Font.ITALIC, 20));
            frame.add(label8);

            JLabel label9 = new JLabel("Dialog, Plain, 18");
            label9.setFont(new Font("Dialog", Font.PLAIN, 18));
            frame.add(label9);

            JLabel label10 = new JLabel("DialogInput, Bold, 17");
            label10.setFont(new Font("DialogInput", Font.BOLD, 17));
            frame.add(label10);

            JLabel label11 = new JLabel("Lucida Bright, Plain, 18");
            label11.setFont(new Font("Lucida Bright", Font.PLAIN, 18));
            frame.add(label11);

            JLabel label12 = new JLabel("Comic Sans MS, Bold, 16");
            label12.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
            frame.add(label12);

            JLabel label13 = new JLabel("Papyrus, Italic, 20");
            label13.setFont(new Font("Papyrus", Font.ITALIC, 20));
            frame.add(label13);

            JLabel label14 = new JLabel("Impact, Bold, 22");
            label14.setFont(new Font("Impact", Font.BOLD, 22));
            frame.add(label14);

            JLabel label15 = new JLabel("Serif, Plain, 24");
            label15.setFont(new Font("Serif", Font.PLAIN, 24));
            frame.add(label15);

            JLabel label16 = new JLabel("Trebuchet MS, Bold Italic, 19");
            label16.setFont(new Font("Trebuchet MS", Font.BOLD + Font.ITALIC, 19));
            frame.add(label16);

            JLabel label17 = new JLabel("Garamond, Plain, 18");
            label17.setFont(new Font("Garamond", Font.PLAIN, 18));
            frame.add(label17);

            JLabel label18 = new JLabel("Tahoma, Italic, 16");
            label18.setFont(new Font("Tahoma", Font.ITALIC, 16));
            frame.add(label18);

            JLabel label19 = new JLabel("Century Gothic, Plain, 20");
            label19.setFont(new Font("Century Gothic", Font.PLAIN, 20));
            frame.add(label19);

            JLabel label20 = new JLabel("Candara, Bold, 18");
            label20.setFont(new Font("Candara", Font.BOLD, 18));
            frame.add(label20);

            frame.setVisible(true);
        }
}





