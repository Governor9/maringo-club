import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClubMembership {
    private JFrame previousWindow;
    public ClubMembership(JFrame previousWindow){
        JFrame frame = new JFrame();
        frame.setTitle("Club Members");
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcTop = new GridBagConstraints();
        gbcTop.insets = new Insets(10,10,10,10);
        gbcTop.anchor = GridBagConstraints.WEST;

        JLabel membersLabel = new JLabel("CLUB MEMBERSHIP MANAGEMENT");
        membersLabel.setFont(new Font("Verdana", Font.BOLD, 18));
        membersLabel.setFocusable(false);
        gbcTop.gridx=0;
        gbcTop.gridy=2;
        topPanel.add(membersLabel, gbcTop);

        frame.add(topPanel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();

        JPanel membersPanel = new JPanel(new BorderLayout());
        JLabel minorsLabel = new JLabel("Minor Members");
        minorsLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        membersPanel.setFocusable(false);
        membersPanel.add(minorsLabel, BorderLayout.NORTH);

        Object[][] data = {
                {"John",25,"Engineer"},
                {"Alice",30,"Designer"},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123}
        };

        String[] columnNames = {"Name","Age","Occupation"};
        DefaultTableModel model = new DefaultTableModel(data,columnNames);

        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(600,100));
        table.setEnabled(false);
        table.setFont(new Font("Arial", Font.BOLD, 12));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);

        membersPanel.add(scrollPane);

        frame.add(mainPanel,BorderLayout.CENTER);

        JPanel gamesPlayedPanel = new JPanel(new BorderLayout());
        Object[][] data1 = {
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"}
        };

        String[] columnNames1 = {"Name","Age","Occupation", "Date"};
        DefaultTableModel model1 = new DefaultTableModel(data1,columnNames1);

        JTable table1 = new JTable(model1);
        table1.setPreferredScrollableViewportSize(new Dimension(600,100));
        table1.setEnabled(false);
        table1.setFont(new Font("Arial", Font.BOLD, 12));
        table1.setFillsViewportHeight(true);

        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(table1);

        table1.getColumnModel().getColumn(0).setPreferredWidth(5);
        gamesPlayedPanel.setSize(400,300);

        JLabel gamesPlayedLabel = new JLabel("Middle Group");
        gamesPlayedLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        gamesPlayedLabel.setFocusable(false);
        gamesPlayedPanel.add(gamesPlayedLabel, BorderLayout.NORTH);
        gamesPlayedPanel.add(scrollPane1);

        JPanel seniorsPanel = new JPanel(new BorderLayout());
        Object[][] data2 = {
                {"John",25,"Engineer",123},
                {"Alice",30,"Designer"},
                {"Alice",30,"Designer"},
                {"John",25,"Engineer",123}
        };

        String[] columnNames2 = {"Name","Age","Occupation", "Date"};
        DefaultTableModel model2 = new DefaultTableModel(data2,columnNames2);

        JTable table2 = new JTable(model2);
        table2.setPreferredScrollableViewportSize(new Dimension(600,100));
        table2.setEnabled(false);
        table2.setFont(new Font("Arial", Font.BOLD, 12));
        table2.setFillsViewportHeight(true);

        JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setViewportView(table2);

        table2.getColumnModel().getColumn(0).setPreferredWidth(5);
        seniorsPanel.setSize(400,300);

        JLabel seniorsLabel = new JLabel("Senior Members");
        seniorsLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        seniorsLabel.setFocusable(false);
        seniorsPanel.add(seniorsLabel, BorderLayout.NORTH);
        seniorsPanel.add(scrollPane2);

        JButton addMemberButton = new JButton("NEW MEMBER");
        addMemberButton.setFocusable(false);
        addMemberButton.setFont(new Font("Arial", Font.BOLD, 18));
        addMemberButton.setPreferredSize(new Dimension(200,50));
        addMemberButton.setBackground(new Color(129, 176, 176));
        addMemberButton.setForeground(Color.white);
        addMemberButton.setBorderPainted(false);
        addMemberButton.setFocusPainted(false);

        addMemberButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                addMemberButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addMemberButton.setBorderPainted(false);
            }
        });

        addMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddMember(frame);
            }
        });

        JButton backButton = new JButton("BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.setPreferredSize(new Dimension(200,50));
        backButton.setBackground(new Color(141, 185, 185));
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

        JButton deleteMemberButton = new JButton("DELETE");
        deleteMemberButton.setFocusable(false);
        deleteMemberButton.setFont(new Font("Arial", Font.BOLD, 18));
        deleteMemberButton.setPreferredSize(new Dimension(150,50));
        deleteMemberButton.setBackground(new Color(157, 205, 205));
        deleteMemberButton.setForeground(Color.red);
        deleteMemberButton.setBorderPainted(false);
        deleteMemberButton.setFocusPainted(false);

        deleteMemberButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                deleteMemberButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deleteMemberButton.setBorderPainted(false);
            }
        });
        mainPanel.add(membersPanel);
        mainPanel.add(gamesPlayedPanel);
        mainPanel.add(seniorsPanel);
        mainPanel.add(backButton);
        mainPanel.add(addMemberButton);
        mainPanel.add(deleteMemberButton);

        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ClubMembership(new JFrame());
    }
}
