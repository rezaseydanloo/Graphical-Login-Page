package GUI;




import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import User.*;

public class GUISigninClass {
    public void SignIn() {


        JFrame frame = new JFrame("sign in page");
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
        JPasswordField textField2 = new JPasswordField("", 35);
        TextField textField3 = new TextField("",35);
        JLabel labelUserName = new JLabel(" user name :");
        JLabel labelPassWord = new JLabel(" password   :");
        JLabel labelNotice1 = new JLabel(" !  Enter your information below , for sign in  ");
        JLabel labelSignInButton = new JLabel("SIGN IN");
        JLabel labelLogIn = new JLabel("  sign in");
        JLabel labelNotice2 = new JLabel("     !!   if you already have an account ");
        JLabel label7 = new JLabel("   mmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        JLabel labelEmail = new JLabel(" email");
        JButton LogInButton = new JButton("LOG IN");
        JButton ContinueButton = new JButton("CONTINUE");



        //--------------------------------------------------------------------------------------------------------------
        //color

        Color customColorlabale1 = new Color(65, 165, 200); // This is a light blue color
        Color customColorlabale2 = new Color(30, 130, 165); // This is a light blue color
        Color customColorlabale3 = new Color(85, 185, 220); // This is a light blue color
        Color customColorContinue = new Color(0, 90, 125); // This is a light blue color
        Color customColorSignin = new Color(0, 90, 125); // This is a light blue color
        Color customColorlevel = new Color(250,250,250);
        Color customColorEmail = new Color(5, 105, 140);
        labelUserName.setOpaque(true);
        labelPassWord.setOpaque(true);
        labelNotice1.setOpaque(true);
        labelLogIn.setOpaque(true);
        labelNotice2.setOpaque(true);
        ContinueButton.setOpaque(true);
        LogInButton.setOpaque(true);
        label7.setOpaque(true);
        labelEmail.setOpaque(true);
        labelEmail.setBackground(customColorSignin);
        labelUserName.setBackground(customColorlabale1);
        labelPassWord.setBackground(customColorlabale2);
        labelNotice1.setBackground(customColorlabale3);
        labelLogIn.setBackground(customColorlabale3);
        labelNotice2.setBackground(customColorSignin);
        label7.setBackground(customColorlevel);
        ContinueButton.setBackground(customColorContinue);
        LogInButton.setBackground(customColorSignin);
        labelEmail.setBackground(customColorEmail);

        //--------------------------------------------------------------------------------------------------------------
        //font

        labelUserName.setFont(new Font("Impact", Font.BOLD, 22));
        labelPassWord.setFont(new Font("Impact", Font.BOLD, 22));
        labelNotice1.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        labelLogIn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelNotice2.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        ContinueButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        LogInButton.setFont(new Font("Georgia", Font.BOLD + Font.ITALIC, 14));
        labelEmail.setFont(new Font("Impact", Font.BOLD, 22));

        //--------------------------------------------------------------------------------------------------------------

        frame.add(textField1);
        frame.add(textField2);
        frame.add(labelUserName);
        frame.add(labelPassWord);
        frame.add(labelNotice1);
        frame.add(labelSignInButton);
        frame.add(labelLogIn);
        frame.add(labelNotice2);
        frame.add(label7);
        frame.add(labelEmail);
        frame.add(textField3);
        frame.add(LogInButton);
        frame.add(ContinueButton);


        textField1.setBounds(234,135,260,35);
        textField2.setBounds(234,185,260,35);
        textField3.setBounds(234,237,260,35);
        labelUserName.setBounds(82,135,150,35);
        labelPassWord.setBounds(82,185,150,38);
        labelNotice1.setBounds(82,80,320,35);
        labelLogIn.setBounds(410,80,83,35);
        labelNotice2.setBounds(200,340,293,30);
        label7.setBounds(234,220,260,3);
        labelEmail.setBounds(82,237,150,35);
        LogInButton.setBounds(82,340,110,30);
        ContinueButton.setBounds(82,300,110,30);




        //--------------------------------------------------------------------------------------------------------------


        textField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {

                FileAndHashing file = new FileAndHashing();


                String username = textField2.getText();
                String password = textField2.getText();


                username=username.trim();
                password=password.trim();


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
                    labelPassWord.setForeground(Color.red);

                } else if (l2.matches()){

                    label7.setForeground(Color.orange);
                    labelPassWord.setForeground(Color.orange);


                } else if (l3.matches()) {
                    label7.setForeground(Color.yellow);
                    labelPassWord.setForeground(Color.yellow);


                } else if (l4.matches()) {
                    label7.setForeground(Color.green );
                    labelPassWord.setForeground(Color.green );


                } else if (password.length()<8) {
                    label7.setForeground(Color.red);
                    labelPassWord.setForeground(Color.red);
                    //JOptionPane.showMessageDialog(null, "The length of the password is short, it must be at least 8 characters");

                }else
                    //JOptionPane.showMessageDialog(null, "! your password has an unknown format");
                System.out.println("! your password has an unknown format");


            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {


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
                    labelPassWord.setForeground(Color.red);
                    System.out.println("level1");

                } else if (l2.matches()){

                    label7.setForeground(Color.orange);
                    labelPassWord.setForeground(Color.orange);
                    System.out.println("level2");

                } else if (l3.matches()) {
                    label7.setForeground(Color.yellow);
                    labelPassWord.setForeground(Color.yellow);
                    System.out.println("level3");

                } else if (l4.matches()) {
                    label7.setForeground(Color.green );
                    labelPassWord.setForeground(Color.green );
                    System.out.println("level4");

                } else if (password.length()<8) {
                    label7.setForeground(Color.red);
                    labelPassWord.setForeground(Color.red);
                    //JOptionPane.showMessageDialog(null, "The length of the password is short, it must be at least 8 characters");

                }else

                    //JOptionPane.showMessageDialog(null, "! your password has an unknown format");
                System.out.println("! your password has an unknown format");


            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {

            }
        });

        //--------------------------------------------------------------------------------------------------------------


        ContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                email chekemail = new email();
                FileAndHashing file = new FileAndHashing();

                String username = textField1.getText();
                String password = textField2.getText();
                String emailstr = textField3.getText();

                password = password.trim();
                username=username.trim();
                emailstr=emailstr.trim();

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


                if (chekemail.chekemail(emailstr)){

                    if (l1lower.matches()||l1upper.matches()||l1number.matches()){
                        label7.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, " ! your password has not the neseccry level ");
                        System.out.println("level1");

                    } else if (l2.matches()){

                        label7.setForeground(Color.orange);
                        file.file_hashing(password,username,emailstr);
                        System.out.println("level2");

                    } else if (l3.matches()) {
                        label7.setForeground(Color.yellow);
                        file.file_hashing(password,username,emailstr);
                        System.out.println("level3");

                    } else if (l4.matches()) {
                        label7.setForeground(Color.green );
                        file.file_hashing(password,username,emailstr);
                        System.out.println("level4");

                    } else if (password.length()<8) {
                        label7.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, "The length of the password is short, it must be at least 8 characters");

                    }else
                        JOptionPane.showMessageDialog(null, "! your password has an unknown format");
                    System.out.println("! your password has an unknown format");

                }

                else {

                    JOptionPane.showMessageDialog(null, " ! your email invalid ");

                }


            }
        });

        //--------------------------------------------------------------------------------------------------------------


        LogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                frame.setVisible(false);

                GUILoginClass login = new GUILoginClass();
                login.LogIn();

            }
        });

        //--------------------------------------------------------------------------------------------------------------
        frame.add(panel);
        panel.setBounds(0, 0, frameWidth, frameHeight);
        frame.setVisible(true);



    }
}
