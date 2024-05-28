package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.*;
import User.FileAndHashing;

public class GUILoginClass {

    public void LogIn () {


        JFrame frame = new JFrame("Login page");
        frame.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int frameWidth = 580;
        int frameHeight = 470;
        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;

        frame.setBounds(x, y, frameWidth, frameHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //--------------------------------------------------------------------------------------------------------------

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            try {

                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("//home/rezaseydanloo/Downloads/abismo 2.jpeg").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };


        frame.setLayout(null);


        //--------------------------------------------------------------------------------------------------------------


        TextField textField1 = new TextField("  ", 35);
        JPasswordField textField2 = new JPasswordField("", 35);
        JLabel label1 = new JLabel(" user name :");
        JLabel label2 = new JLabel(" password   :");
        JLabel label3 = new JLabel(" ! Enter your user name and password for log in ");
        JLabel label4 = new JLabel("SIGN IN");
        JLabel label5 = new JLabel("  Log in");
        JLabel label6 = new JLabel(" !! if you want to go back to the sign in page ");
        JButton BackButton = new JButton("BACK");
        JButton ContinueButton = new JButton("CONTINUE");


        //--------------------------------------------------------------------------------------------------------------
        //color

        Color customColorlabale1 = new Color(65, 165, 200); // This is a light blue color
        Color customColorlabale2 = new Color(30, 130, 165); // This is a light blue color
        Color customColorlabale3 = new Color(85, 185, 220); // This is a light blue color
        Color customColorContinue = new Color(0, 90, 125); // This is a light blue color
        Color customColorSignin = new Color(0, 90, 125); // This is a light blue color
        Color customColorlevel = new Color(250,250,250);
        label5.setForeground(customColorlevel);
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        label6.setOpaque(true);
        ContinueButton.setOpaque(true);
        BackButton.setOpaque(true);
        label1.setBackground(customColorlabale1);
        label2.setBackground(customColorlabale2);
        label3.setBackground(customColorlabale3);
        label6.setBackground(customColorSignin);
        ContinueButton.setBackground(customColorContinue);
        BackButton.setBackground(customColorSignin);

        //--------------------------------------------------------------------------------------------------------------
        //font

        label1.setFont(new Font("Impact", Font.BOLD, 22));
        label2.setFont(new Font("Impact", Font.BOLD, 22));
        label3.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        label5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label6.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        ContinueButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        BackButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));

        //--------------------------------------------------------------------------------------------------------------

        frame.add(textField1);
        frame.add(textField2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        //frame.add(label7);
        //frame.add(label5);
        frame.add(BackButton);
        frame.add(ContinueButton);


        textField1.setBounds(234,135,260,35);
        textField2.setBounds(234,195,260,37);
        label1.setBounds(82,135,150,35);
        label2.setBounds(82,195,150,38);
        label3.setBounds(82,80,320,35);
        label5.setBounds(410,80,83,35);
        label6.setBounds(200,320,293,30);
        BackButton.setBounds(82,320,110,30);
        ContinueButton.setBounds(82,280,110,30);


        //--------------------------------------------------------------------------------------------------------------

        ContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                FileAndHashing file = new FileAndHashing();

                String username = textField2.getText();
                String password = textField2.getText();
                String hashedpassword ;
                password = password.trim();
                username = username.trim();

                hashedpassword=file.hashing(password);

                if (file.FileReader(hashedpassword,username)){

                    //JOptionPane.showMessageDialog(null, " ! user successfully logged in");

                }

                else {

                    //JOptionPane.showMessageDialog(null, " ! user not found ");

                }

            }
        });

        //--------------------------------------------------------------------------------------------------------------

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setVisible(false);
                GUISigninClass signin = new GUISigninClass();
                signin.SignIn();
            }
        });

        //--------------------------------------------------------------------------------------------------------------

        frame.add(panel);
        panel.setBounds(0, 0, frameWidth, frameHeight);
        frame.setVisible(true);

    }
}