import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationForm {
    public RegistrationForm(){

        JFrame frame = new JFrame("Maringo Sports Club Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Insets for components
        gbc.anchor = GridBagConstraints.WEST;

        //ClubMember clubMember = new ClubMember();

        JTextField txtFullName = new JTextField(20);
        JTextField txtDateOfBirth = new JTextField(20);
        JTextField txtNextOfKin = new JTextField(20);
        JTextField txtContactDetails = new JTextField(20);
        JTextField txtSubCounties = new JTextField(20);
        JTextField txtSchool = new JTextField(20);
        JTextField txtGames = new JTextField(20);
        JTextField txtWeight = new JTextField(20);
        JTextField txtHeight = new JTextField(20);
        JTextField txtSpecialNeeds = new JTextField(20);
        JTextField txtMembership = new JTextField(20);

        // Adding components with GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("Full Name:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(txtFullName, gbc);

        // Gender Panel
        JPanel genderPanel = createGenderPanel();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        mainPanel.add(genderPanel, gbc);

        // Date of Birth
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(new JLabel("Date of Birth:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(txtDateOfBirth, gbc);

        // Next of Kin
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(new JLabel("Next of Kin:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(txtNextOfKin, gbc);

        // Contact Details
        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(new JLabel("Contact:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        mainPanel.add(txtContactDetails, gbc);

        // Sub-Counties
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(new JLabel("Sub-County:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        mainPanel.add(txtSubCounties, gbc);

        // School/College
        gbc.gridx = 0;
        gbc.gridy = 6;
        mainPanel.add(new JLabel("School"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        mainPanel.add(txtSchool, gbc);

        // Games of Interest
        String[] sports = {"Football","BasketBall","Tennis"};
        JComboBox<String> comboBox = new JComboBox<>(sports);
        //comboBox.add((Component) game.getTeamMembers());
        //comboBox.add(new JList<>(game.getTeamMembers().toArray(new String[0])));
        gbc.gridx = 0;
        gbc.gridy = 7;
        mainPanel.add(new JLabel("Games"), gbc); // of Interest (comma-separated):
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        mainPanel.add(comboBox, gbc);

        // Weight
        gbc.gridx = 0;
        gbc.gridy = 8;
        mainPanel.add(new JLabel("Weight:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        mainPanel.add(txtWeight, gbc);

        // Height
        gbc.gridx = 0;
        gbc.gridy = 9;
        mainPanel.add(new JLabel("Height:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        mainPanel.add(txtHeight, gbc);

        // Special Needs
        String[] specialN = {"Yes","No"};
        JComboBox<String> comboBox1 = new JComboBox<>(specialN);
        gbc.gridx = 0;
        gbc.gridy = 10;
        mainPanel.add(new JLabel("Special Needs:"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        mainPanel.add(comboBox1, gbc);

        // Membership Type
        String[] membership = {"Individual","Group"};
        JComboBox<String> comboBox2 = new JComboBox<>(membership);
        gbc.gridx = 0;
        gbc.gridy = 11;
        mainPanel.add(new JLabel("Membership:"), gbc); // Type (Individual/Group)
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        mainPanel.add(comboBox2, gbc);

        // Register Button
        JButton registerButton = new JButton("NEXT");
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        mainPanel.add(registerButton, gbc);

        // Register Button Action Listener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle registration logic here
                 new CompletePayment(frame);

//                clubMember.setFullName(txtFullName.getText());
//                clubMember.setDob(txtDateOfBirth.getText());
//                JOptionPane.showMessageDialog(frame, "Registration Successful!");
//                System.out.println(clubMember.getFullName());
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        String url = "jbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while ((resultSet.next())) {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        SwingUtilities.invokeLater(() -> {
            RegistrationForm registrationForm1 = new RegistrationForm();
        });
    }

    // Utility method to create a panel with the Gender radio buttons
    private static JPanel createGenderPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);


        panel.add(new JRadioButton("Male"));
        panel.add(new JRadioButton("Female"));

        return panel;
    }
}
