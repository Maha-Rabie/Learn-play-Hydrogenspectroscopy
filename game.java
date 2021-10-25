package hydrogenspectroscopy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.LayoutStyle.*;
import javax.swing.GroupLayout.*;

public class game extends JPanel {

    game() {
        initComponents();
    }
    private JButton btnButton;
    private JButton btnMercury;
    private JButton btnSodium;
    private JButton btnNeon;
    private JButton btnHelium;
    private JButton btnHydrogen;
    Icon Me = new ImageIcon("5.jpg");
    Icon So = new ImageIcon("4.jpg");
    Icon Ne = new ImageIcon("3.jpg");
    Icon He = new ImageIcon("2.jpg");
    Icon H = new ImageIcon("1.jpg");
    Icon W = new ImageIcon("21.jpg");
    Icon F = new ImageIcon("22.jpg");

    public void initComponents() {

        btnButton = new JButton("");
        btnButton.setForeground(new Color(0, 0, 0));
        btnButton.setBackground(Color.WHITE);
        btnButton.setToolTipText("");
        btnButton.setIcon(new ImageIcon("main1.png"));
        btnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnButton) {
                    if (btnNeon.getIcon() == H && btnHydrogen.getIcon() == He && btnMercury.getIcon() == Ne && btnHelium.getIcon() == So && btnSodium.getIcon() == Me) {
                        JOptionPane.showMessageDialog(null, "you win", null, JOptionPane.INFORMATION_MESSAGE, W);

                    } else {
                        JOptionPane.showMessageDialog(null, "Try again", null, JOptionPane.INFORMATION_MESSAGE, F);
                    }
                }

            }

        });

        btnMercury = new JButton();
        btnMercury.setBackground(Color.WHITE);
        btnMercury.setIcon(Me);

        btnSodium = new JButton();
        btnSodium.setBackground(Color.WHITE);
        btnSodium.setIcon(So);

        btnNeon = new JButton();
        btnNeon.setBackground(Color.WHITE);
        btnNeon.setIcon(Ne);

        btnHelium = new JButton();
        btnHelium.setBackground(Color.WHITE);
        btnHelium.setIcon(He);

        btnHydrogen = new JButton();
        btnHydrogen.setBackground(Color.WHITE);
        btnHydrogen.setIcon(H);

        btnSodium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnSodium) {
                    Icon s1 = btnHelium.getIcon();
                    Icon s2 = btnSodium.getIcon();
                    if (s2 != null) {
                        btnSodium.setIcon(s1);
                        btnHelium.setIcon(s2);
                    }
                }

            }
        });

        btnHelium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHelium) {
                    Icon s1 = btnMercury.getIcon();
                    Icon s2 = btnHelium.getIcon();
                    if (s2 != null) {
                        btnHelium.setIcon(s1);
                        btnMercury.setIcon(s2);
                    }
                }

            }
        });
        btnMercury.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnMercury) {
                    Icon s1 = btnHydrogen.getIcon();
                    Icon s2 = btnMercury.getIcon();
                    if (s2 != null) {
                        btnMercury.setIcon(s1);
                        btnHydrogen.setIcon(s2);
                    }
                }

            }
        });
        btnHydrogen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnHydrogen) {
                    Icon s1 = btnNeon.getIcon();
                    Icon s2 = btnHydrogen.getIcon();
                    if (s2 != null) {
                        btnHydrogen.setIcon(s1);
                        btnNeon.setIcon(s2);
                    }
                }

            }
        });
        btnNeon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnNeon) {
                    Icon s1 = btnSodium.getIcon();
                    Icon s2 = btnNeon.getIcon();
                    if (s2 != null) {
                        btnNeon.setIcon(s1);
                        btnSodium.setIcon(s2);
                    }
                }

            }
        });

        JLabel lblClickToCheck = new JLabel("Click to check");

        JLabel lblArrangeForEach = new JLabel("Arrange elements to fit its spectrum");

        JLabel lblSelectTheItem = new JLabel("Select the element to move up");

        GroupLayout gl_panel_2 = new GroupLayout(this);
        gl_panel_2.setHorizontalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNeon, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                        .addComponent(btnHelium, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                        .addComponent(btnMercury, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                        .addComponent(btnHydrogen, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                        .addComponent(btnSodium, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addGap(10)
                                                .addComponent(lblClickToCheck))
                                        .addComponent(btnButton, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE))
                                .addGap(47))
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblArrangeForEach)
                                .addContainerGap(527, Short.MAX_VALUE))
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSelectTheItem)
                                .addContainerGap(566, Short.MAX_VALUE))
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addContainerGap(694, Short.MAX_VALUE))
        );
        gl_panel_2.setVerticalGroup(
                gl_panel_2.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblArrangeForEach)
                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSelectTheItem)
                                .addGap(18)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addComponent(btnNeon, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(29)
                                                .addComponent(btnHydrogen, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(34)
                                                .addComponent(btnMercury, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(29)
                                                .addComponent(btnHelium, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27)
                                                .addComponent(btnSodium, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnButton, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblClickToCheck)
                                .addGap(32)
                                .addGap(35))
        );
        this.setLayout(gl_panel_2);

    }

}
