import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameFacilitation {
    private JFrame previousWindow;
    public GameFacilitation(JFrame previousWindow) {
        JFrame frame = new JFrame();
        frame.setTitle("Maringo Sports Club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Game Facilitation Pane");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.CENTER;

        Dimension buttonSize = new Dimension(200,50);

        JButton swimmingButton = new JButton("Swimmimg");
        swimmingButton.setFont(new Font("Arial", Font.BOLD, 18));
        swimmingButton.setPreferredSize(buttonSize);
        swimmingButton.setFocusable(false);
        swimmingButton.setBorderPainted(false);
        swimmingButton.setFocusPainted(false);

        swimmingButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                swimmingButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                swimmingButton.setBorderPainted(false);
            }
        });

        JButton hockeyButton = new JButton("Hockey");
        hockeyButton.setFocusable(false);
        hockeyButton.setPreferredSize(buttonSize);
        hockeyButton.setFont(new Font("Arial", Font.BOLD, 18));
        hockeyButton.setBorderPainted(false);
        hockeyButton.setFocusPainted(false);

        hockeyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hockeyButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hockeyButton.setBorderPainted(false);
            }
        });

        JButton lawnTennisButton = new JButton("Lawn Tennis");
        lawnTennisButton.setFocusable(false);
        lawnTennisButton.setFont(new Font("Arial", Font.BOLD, 18));
        lawnTennisButton.setPreferredSize(buttonSize);
        lawnTennisButton.setBorderPainted(false);
        lawnTennisButton.setFocusPainted(false);

        lawnTennisButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lawnTennisButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lawnTennisButton.setBorderPainted(false);
            }
        });

        JButton tableTennisButton = new JButton("Table Tennis");
        tableTennisButton.setFocusable(false);
        tableTennisButton.setFont(new Font("Arial", Font.BOLD, 18));
        tableTennisButton.setPreferredSize(buttonSize);

        tableTennisButton.setBorderPainted(false);
        tableTennisButton.setFocusPainted(false);

        tableTennisButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                tableTennisButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tableTennisButton.setBorderPainted(false);
            }
        });

        JButton dartsButton = new JButton("Darts");
        dartsButton.setFocusable(false);
        dartsButton.setFont(new Font("Arial", Font.BOLD, 18));
        dartsButton.setPreferredSize(buttonSize);
        dartsButton.setBorderPainted(false);
        dartsButton.setFocusPainted(false);

        dartsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                dartsButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                dartsButton.setBorderPainted(false);
            }
        });

        // Button Actions (Navigate to respective interfaces)
        swimmingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                openRegistrationInterface();
                new GameData(frame);
            }
        });
        hockeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openStoreInterface();
            }
        });
        lawnTennisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openMembershipInterface();
                //new AddMember(frame);
            }
        });
        tableTennisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFacilitationInterface();
            }
        });
        dartsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportsInterface();
            }
        });

        JButton badmintonButton = new JButton("Badminton");
        badmintonButton.setFont(new Font("Arial", Font.BOLD, 18));
        badmintonButton.setPreferredSize(buttonSize);
        badmintonButton.setFocusable(false);
        badmintonButton.setBorderPainted(false);
        badmintonButton.setFocusPainted(false);

        badmintonButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                badmintonButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                badmintonButton.setBorderPainted(false);
            }
        });

        JButton volleyBallButton = new JButton("Volleyball");
        volleyBallButton.setFocusable(false);
        volleyBallButton.setPreferredSize(buttonSize);
        volleyBallButton.setFont(new Font("Arial", Font.BOLD, 18));
        volleyBallButton.setBorderPainted(false);
        volleyBallButton.setFocusPainted(false);

        volleyBallButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                volleyBallButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                volleyBallButton.setBorderPainted(false);
            }
        });

        JButton basketBallButton = new JButton("Basketball");
        basketBallButton.setFocusable(false);
        basketBallButton.setFont(new Font("Arial", Font.BOLD, 18));
        basketBallButton.setPreferredSize(buttonSize);
        basketBallButton.setBorderPainted(false);
        basketBallButton.setFocusPainted(false);

        basketBallButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                basketBallButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                basketBallButton.setBorderPainted(false);
            }
        });

        JButton netballButton = new JButton("Netball");
        netballButton.setFocusable(false);
        netballButton.setFont(new Font("Arial", Font.BOLD, 18));
        netballButton.setPreferredSize(buttonSize);

        netballButton.setBorderPainted(false);
        netballButton.setFocusPainted(false);

        netballButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                netballButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                netballButton.setBorderPainted(false);
            }
        });

        JButton footballButton = new JButton("Football");
        footballButton.setFocusable(false);
        footballButton.setFont(new Font("Arial", Font.BOLD, 18));
        footballButton.setPreferredSize(buttonSize);
        footballButton.setBorderPainted(false);
        footballButton.setFocusPainted(false);

        footballButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                footballButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                footballButton.setBorderPainted(false);
            }
        });

        // Button Actions (Navigate to respective interfaces)
        badmintonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                openRegistrationInterface();
                new AddMember(frame);
            }
        });
        volleyBallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openStoreInterface();
            }
        });
        basketBallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openMembershipInterface();
                new AddMember(frame);
            }
        });
        netballButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFacilitationInterface();
            }
        });
        footballButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportsInterface();
            }
        });

        JButton baseballButton = new JButton("Baseball");
        baseballButton.setFont(new Font("Arial", Font.BOLD, 18));
        baseballButton.setPreferredSize(buttonSize);
        baseballButton.setFocusable(false);
        baseballButton.setBorderPainted(false);
        baseballButton.setFocusPainted(false);

        baseballButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                baseballButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                baseballButton.setBorderPainted(false);
            }
        });

        JButton rugbyButton = new JButton("Rugby");
        rugbyButton.setFocusable(false);
        rugbyButton.setPreferredSize(buttonSize);
        rugbyButton.setFont(new Font("Arial", Font.BOLD, 18));
        rugbyButton.setBorderPainted(false);
        rugbyButton.setFocusPainted(false);

        rugbyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                rugbyButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                rugbyButton.setBorderPainted(false);
            }
        });

        JButton poolButton = new JButton("Pool");
        poolButton.setFocusable(false);
        poolButton.setFont(new Font("Arial", Font.BOLD, 18));
        poolButton.setPreferredSize(buttonSize);
        poolButton.setBorderPainted(false);
        poolButton.setFocusPainted(false);

        poolButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                poolButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                poolButton.setBorderPainted(false);
            }
        });

        JButton chessButton = new JButton("Chess");
        chessButton.setFocusable(false);
        chessButton.setFont(new Font("Arial", Font.BOLD, 18));
        chessButton.setPreferredSize(buttonSize);

        chessButton.setBorderPainted(false);
        chessButton.setFocusPainted(false);

        chessButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                chessButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                chessButton.setBorderPainted(false);
            }
        });

        JButton draftButton = new JButton("Draft");
        draftButton.setFocusable(false);
        draftButton.setFont(new Font("Arial", Font.BOLD, 18));
        draftButton.setPreferredSize(buttonSize);
        draftButton.setBorderPainted(false);
        draftButton.setFocusPainted(false);

        draftButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                draftButton.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                draftButton.setBorderPainted(false);
            }
        });

        // Button Actions (Navigate to respective interfaces)
        baseballButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                openRegistrationInterface();
                new AddMember(frame);
            }
        });
        rugbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openStoreInterface();
            }
        });
        poolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //openMembershipInterface();
                new AddMember(frame);
            }
        });
        chessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFacilitationInterface();
            }
        });
        draftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportsInterface();
            }
        });

        JButton backButton = new JButton("BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.setPreferredSize(buttonSize);
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
                frame.dispose();
                previousWindow.setVisible(true);
            }
        });

        // Add buttons to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(swimmingButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(hockeyButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(lawnTennisButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        buttonPanel.add(tableTennisButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        buttonPanel.add(dartsButton,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        buttonPanel.add(badmintonButton,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        buttonPanel.add(volleyBallButton,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        buttonPanel.add(basketBallButton,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        buttonPanel.add(netballButton,gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        buttonPanel.add(footballButton,gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        buttonPanel.add(baseballButton,gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        buttonPanel.add(rugbyButton,gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        buttonPanel.add(poolButton,gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        buttonPanel.add(chessButton,gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        buttonPanel.add(draftButton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        buttonPanel.add(backButton,gbc);

        // Add button panel to the center of the frame
        frame.add(buttonPanel);

        // Set frame size and visibility
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    // Methods to open respective interfaces (to be implemented)
    private void openRegistrationInterface() {
        // Implement logic to open registration interface
        //new AddMember(new JFrame());
    }

    private void openStoreInterface() {
        // Implement logic to open store interface
    }

    private void openMembershipInterface() {
        // Implement logic to open membership fee interface
    }

    private void openFacilitationInterface() {
        // Implement logic to open game facilitation interface
    }

    private void openReportsInterface() {
        // Implement logic to open reports interface
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFacilitation(new JFrame());
            }
        });
    }
}

