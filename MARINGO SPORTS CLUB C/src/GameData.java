import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameData {
    private JFrame previousWindow;
    public GameData(JFrame previousWindow){
        JFrame frame = new JFrame();
        frame.setTitle("GameData");
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcTop = new GridBagConstraints();
        gbcTop.insets = new Insets(10,10,10,10);
        gbcTop.anchor = GridBagConstraints.WEST;

        JTextField txtPatron = new JTextField(20);
        txtPatron.setFont(new Font("Arial", Font.BOLD, 14));
        txtPatron.setForeground(Color.blue);
        txtPatron.setEditable(false);
        JLabel patronLabel = new JLabel("Swimming Patron");
        patronLabel.setFont(new Font("Arial", Font.BOLD, 16));
        patronLabel.setFocusable(false);

        JTextField txtCaptain = new JTextField(20);
        txtCaptain.setFont(new Font("Arial", Font.BOLD, 14));
        txtCaptain.setForeground(Color.blue);
        txtCaptain.setEditable(false);
        JLabel captainLabel = new JLabel("Team Captain");
        captainLabel.setFont(new Font("Arial", Font.BOLD, 16));
        captainLabel.setFocusable(false);

        gbcTop.gridx=0;
        gbcTop.gridy=0;
        topPanel.add(patronLabel, gbcTop);
        gbcTop.gridx=0;
        gbcTop.gridy=1;
        topPanel.add(txtPatron,gbcTop);

        gbcTop.gridx=1;
        gbcTop.gridy=0;
        topPanel.add(captainLabel, gbcTop);
        gbcTop.gridx=1;
        gbcTop.gridy=1;
        topPanel.add(txtCaptain,gbcTop);

        JLabel membersLabel = new JLabel("Team Members");
        membersLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        membersLabel.setFocusable(false);
        gbcTop.gridx=0;
        gbcTop.gridy=2;
        topPanel.add(membersLabel, gbcTop);

        frame.add(topPanel, BorderLayout.NORTH);

        JPanel membersPanel = new JPanel();
        Object[][] data = {
                {"John",25,"Engineer"},
                {"Alice",30,"Designer"},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"}
        };

        String[] columnNames = {"Name","Age","Occupation"};
        DefaultTableModel model = new DefaultTableModel(data,columnNames);

        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(600,160));
        table.setEnabled(false);
        table.setFont(new Font("Arial", Font.BOLD, 12));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);

        membersPanel.add(scrollPane);

        frame.add(membersPanel,BorderLayout.CENTER);

        JPanel gamesPlayedPanel = new JPanel(new BorderLayout());
        Object[][] data1 = {
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"}
        };

        String[] columnNames1 = {"Name","Age","Occupation", "Date"};
        DefaultTableModel model1 = new DefaultTableModel(data1,columnNames1);

        JTable table1 = new JTable(model1);
        table1.setPreferredScrollableViewportSize(new Dimension(600,120));
        table1.setEnabled(false);
        table1.setFont(new Font("Arial", Font.BOLD, 12));
        table1.setFillsViewportHeight(true);

        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(table1);

        table1.getColumnModel().getColumn(0).setPreferredWidth(5);
        gamesPlayedPanel.setSize(400,300);

        JLabel gamesPlayedLabel = new JLabel("Past Events Played");
        gamesPlayedLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        gamesPlayedLabel.setFocusable(false);
        gamesPlayedPanel.add(gamesPlayedLabel, BorderLayout.NORTH);
        gamesPlayedPanel.add(scrollPane1);

        JButton newEventButton = new JButton("ADD NEW EVENT");
        newEventButton.setFocusable(false);
        newEventButton.setFont(new Font("Arial", Font.BOLD, 18));
        newEventButton.setPreferredSize(new Dimension(250,50));
        newEventButton.setBackground(new Color(50, 64, 64));
        newEventButton.setForeground(Color.green);
        newEventButton.setBorderPainted(false);
        newEventButton.setFocusPainted(false);

        newEventButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                newEventButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newEventButton.setBorderPainted(false);
            }
        });

        newEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String[] opponents = {"Internal Team", "External Team"};
                JComboBox<String> comboBox = new JComboBox<>(opponents);
                int result = (JOptionPane.showConfirmDialog(null,comboBox,"The is Playing against: ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE));

                if(result == JOptionPane.OK_OPTION) {
                    String event = (String) comboBox.getSelectedItem();
                }
            }
        });

        JButton backButton = new JButton("BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.setPreferredSize(new Dimension(200,50));
        backButton.setBackground(new Color(50, 64, 64));
        backButton.setForeground(Color.white);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);

        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                backButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backButton.setBorderPainted(false);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousWindow.setVisible(true);
                frame.dispose();
            }
        });
        membersPanel.add(gamesPlayedPanel);
        membersPanel.add(backButton);
        membersPanel.add(newEventButton);

        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GameData(new JFrame());
    }
}
