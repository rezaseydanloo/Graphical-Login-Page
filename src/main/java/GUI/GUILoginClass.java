package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUILoginClass {

    public static void main(String[] args) {


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
                // Load the background image
                Image image = new ImageIcon("//home/rezaseydanloo/Downloads/abismo 2.jpeg").getImage();
                // Draw the background image
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };


        frame.setLayout(null);


        //--------------------------------------------------------------------------------------------------------------


        TextField textField1 = new TextField("  ", 35);
        TextField textField2 = new TextField("  ", 35);
        JLabel label1 = new JLabel(" user name :");
        JLabel label2 = new JLabel(" password   :");
        JLabel label3 = new JLabel(" ! Enter your user name and password for log in ");
        JLabel label4 = new JLabel("SIGN IN");
        JLabel label5 = new JLabel("   log in");
        JLabel label6 = new JLabel("     !!   if you already have an account ");
        JLabel label7 = new JLabel("   #################################");
        //JLabel label5 = new JLabel("CONTINUE");
        JButton SignInButton = new JButton("SIGN IN");
        JButton ContinueButton = new JButton("CONTINUE");



        //--------------------------------------------------------------------------------------------------------------
        //color

        Color customColorlabale1 = new Color(65, 165, 200); // This is a light blue color
        Color customColorlabale2 = new Color(30, 130, 165); // This is a light blue color
        Color customColorlabale3 = new Color(85, 185, 220); // This is a light blue color
        Color customColorContinue = new Color(10, 110, 145); // This is a light blue color
        Color customColorSignin = new Color(0, 100, 135); // This is a light blue color
        Color customColorlevel = new Color(250,250,250);
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        label5.setOpaque(true);
        label6.setOpaque(true);
        ContinueButton.setOpaque(true);
        SignInButton.setOpaque(true);
        label7.setOpaque(true);
        //textField1.setBackground(customColorlabale1);
        label1.setBackground(customColorlabale1);
        label2.setBackground(customColorlabale2);
        label3.setBackground(customColorlabale3);
        label5.setBackground(customColorlabale3);
        label6.setBackground(customColorSignin);
        label7.setBackground(customColorlevel);
        ContinueButton.setBackground(customColorContinue);
        SignInButton.setBackground(customColorSignin);

        //--------------------------------------------------------------------------------------------------------------
        //font

        label1.setFont(new Font("Impact", Font.BOLD, 22));
        label2.setFont(new Font("Impact", Font.BOLD, 22));
        label3.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        label5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label6.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));

        ContinueButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        SignInButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));

        //--------------------------------------------------------------------------------------------------------------

        frame.add(textField1);
        frame.add(textField2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        //frame.add(label5);
        frame.add(SignInButton);
        frame.add(ContinueButton);


        textField1.setBounds(234,135,260,35);
        textField2.setBounds(234,195,260,35);
        label1.setBounds(82,135,150,35);
        label2.setBounds(82,195,150,38);
        label3.setBounds(82,80,320,35);
        //label4.setBounds(170,230,100,50);
        label5.setBounds(410,80,83,35);
        label6.setBounds(200,320,293,30);
        label7.setBounds(234,230,260,3);

        SignInButton.setBounds(82,320,110,30);
        ContinueButton.setBounds(82,280,110,30);



        //--------------------------------------------------------------------------------------------------------------

        ContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

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
                    label7.setForeground(Color.red);
                    System.out.println("level1");

                } else if (l2.matches()){

                    label7.setForeground(Color.orange);
                    System.out.println("level2");

                } else if (l3.matches()) {
                    label7.setForeground(Color.yellow);
                    System.out.println("level3");

                } else if (l4.matches()) {
                    label7.setForeground(Color.green );
                    System.out.println("level4");

                } else if (password.length()<8) {
                    label7.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "The length of the password is short, it must be at least 8 characters");

                }else

                    JOptionPane.showMessageDialog(null, "! your password has an unknown format");
                System.out.println("! your password has an unknown format");

            }
        });




        frame.add(panel);

        // Set the panel's size and position
        panel.setBounds(0, 0, frameWidth, frameHeight);

        // Make the frame visible
        frame.setVisible(true);

    }
}