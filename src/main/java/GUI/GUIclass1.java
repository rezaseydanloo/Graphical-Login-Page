package GUI;


import javax.swing.*;
import java.awt.*;

public class GUIclass1 {
    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Login page");
        frame.setSize(500,500);
        TextField textField1 = new TextField("", 35);
        TextField textField2 = new TextField("", 35);
        JLabel label1 = new JLabel("USER NAME :  ");
        JLabel label2 = new JLabel("PASSWORD  :  ");
        JLabel label3 = new JLabel("! Enter your user name and password for log in ");
        JLabel label4 = new JLabel("SIGN IN");
        JLabel label5 = new JLabel("CONTINUE");
        JButton SignInButton = new JButton();
        JButton ContinueButton = new JButton();

        SignInButton.setBackground(Color.red);
        ContinueButton.setBackground(Color.GREEN);


        frame.add(textField1);
        frame.add(textField2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(SignInButton);
        frame.add(ContinueButton);
        frame.setLayout(null);


        textField1.setBounds(160,130,230,35);
        textField2.setBounds(160,180,230,35);
        label1.setBounds(70,123,100,50);
        label2.setBounds(70,173,100,50);
        label3.setBounds(70,20,300,150);
        label4.setBounds(170,230,100,50);
        label5.setBounds(262,230,100,50);
        SignInButton.setBounds(160,240,70,30);
        ContinueButton.setBounds(250,240,90,30);
        frame.setVisible(true);

    }
}