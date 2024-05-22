import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public MainWindow() {
        JFrame frame = new JFrame();
        frame.setTitle("Maringo Sports Club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(255, 255, 255));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(52, 152, 219));
        JLabel titleLabel = new JLabel("MARINGO SPORTS CLUB SYSTEM");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        topPanel.add(titleLabel);

        frame.add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JPanel firstRowPanel = new JPanel(new GridLayout(1, 2, 20, 20));
        firstRowPanel.setOpaque(false);

        JButton registrationButton = createStyledButton("Club Members");
        JButton storeButton = createStyledButton("Club Store");

        firstRowPanel.add(registrationButton);
        firstRowPanel.add(storeButton);

        JPanel secondRowPanel = new JPanel(new GridLayout(1, 3, 20, 20));
        secondRowPanel.setOpaque(false);

        JButton membershipButton = createStyledButton("Fees Finance");
        JButton facilitationButton = createStyledButton("Game Facilitation");
        JButton reportsButton = createStyledButton("Generate Reports");

        secondRowPanel.add(membershipButton);
        secondRowPanel.add(facilitationButton);
        secondRowPanel.add(reportsButton);

        buttonPanel.add(firstRowPanel);
        buttonPanel.add(secondRowPanel);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClubMembership(frame);
            }
        });

        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreItems(frame);
            }
        });

        membershipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openMembershipInterface();
            }
        });

        facilitationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameFacilitation(frame);
            }
        });

        reportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openReportsInterface();
            }
        });
    }

    private JButton createStyledButton(String text) {
        JButton button = new RoundButton(text);
        button.setFont(new Font("Segoe UI", Font.BOLD, 20));
        button.setFocusPainted(false);
        button.setBackground(new Color(0, 0, 128, 207)); // Navy Blue
//        button.setBackground(new Color(0, 0, 128, 245));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        return button;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}

class RoundButton extends JButton {
    public RoundButton(String label) {
        super(label);
        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
    }
}
