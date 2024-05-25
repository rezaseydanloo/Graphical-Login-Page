package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUIclass2 {
    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Sign in page");
        frame.setResizable(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int frameWidth = 500;
        int frameHeight = 400;
        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;

        frame.setBounds(x, y, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TextField textField1 = new TextField("", 35);
        TextField textField2 = new TextField("", 35);
        TextField textField3 = new TextField("", 35);
        JLabel label1 = new JLabel("USER NAME  :  ");
        JLabel label2 = new JLabel("PASSWORD  :  ");
        JLabel label3 = new JLabel("! Enter your user name, password and email for sign in ");
        JLabel label6 = new JLabel("EMAIL            :  ");
        JButton SignInButton = new JButton();
        JButton ContinueButton = new JButton();

        SignInButton.setBackground(Color.red);
        ContinueButton.setBackground(Color.GREEN);

        JLabel label4 = new JLabel("LOG IN");
        JLabel label5 = new JLabel("CONTINUE");



        frame.setLayout(null);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);

        frame.add(SignInButton);
        frame.add(ContinueButton);



        textField1.setBounds(160,90,230,35);
        textField2.setBounds(160,140,230,35);
        textField3.setBounds(160,190,230,35);
        label1.setBounds(70,83,100,50);
        label2.setBounds(70,133,100,50);
        label3.setBounds(70,-25,350,150);
        label4.setBounds(175,230,100,50);
        label5.setBounds(262,230,100,50);
        label6.setBounds(70,183,100,50);
        SignInButton.setBounds(160,240,70,30);
        ContinueButton.setBounds(250,240,90,30);

        frame.setVisible(true);

        ContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.out.println("clicked here");

                String username = textField2.getText();
                String password = textField2.getText();
                System.out.println(username);
                password = password.trim();
                System.out.println(password);

                Pattern level1lower = Pattern.compile("[a-z]{8,16}");
                Pattern level1upper = Pattern.compile("[A-Z]{8,16}");
                Pattern level1number = Pattern.compile("[0-9]{8,16}");
                Pattern level2 = Pattern.compile("[a-zA-Z]{8,16}");
                Pattern level3 = Pattern.compile("[a-zA-Z0-9]{8,16}");
                Pattern level4 = Pattern.compile("[a-zA-Z0-9@$!%*?&]{8,16}");

                Matcher l1lower = level1lower.matcher(password);
                Matcher l1upper = level1upper.matcher(password);
                Matcher l1number = level1number.matcher(password);

                Matcher l2 = level2.matcher(password);
                Matcher l3 = level3.matcher(password);
                Matcher l4 = level4.matcher(password);

                if (l1lower.matches()||l1upper.matches()||l1number.matches()){
                    label2.setForeground(Color.red);
                    System.out.println("level1");

                } else if (l2.matches()){
                    label2.setForeground(Color.orange);
                    System.out.println("level2");

                } else if (l3.matches()) {
                    label2.setForeground(Color.yellow);
                    System.out.println("level3");

                } else if (l4.matches()) {
                    label2.setForeground(Color.green);
                    System.out.println("level4");

                } else if (password.length()<8) {
                    label2.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "The length of the password is short, it must be at least 8 characters");
                    System.out.println("The length of the password is short, it must be at least 8 characters");
                }else
                    System.out.println("error");


            }
        });



    }
    }
