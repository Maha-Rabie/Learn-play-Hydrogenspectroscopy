package hydrogenspectroscopy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hydrogenspectroscopy {

    private JFrame MainWindow;

    Hydrogenspectroscopy() {
        initialize();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Hydrogenspectroscopy window = new Hydrogenspectroscopy();
                    window.MainWindow.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

     private void initialize() {
        MainWindow = new JFrame("Hydrogen Spectroscopy");
        JPanel Main = new JPanel();
        JPanel sim = new JPanel();
        JPanel g = new JPanel();
        JPanel gtoMain = new JPanel();
        JPanel simtoMain = new JPanel();
        sim.add(new Simulation(), BorderLayout.NORTH);
        sim.add(simtoMain, BorderLayout.SOUTH);
        sim.setBackground(Color.WHITE);
        g.add(new game(), BorderLayout.NORTH);
        g.add(gtoMain, BorderLayout.SOUTH);
        g.setBackground(Color.WHITE);

        MainWindow.add(Main, BorderLayout.CENTER);
        Main.setVisible(true);
        Main.setBackground(Color.WHITE);

        JButton simbutton = new JButton("Hydrogen Simulation");

        simbutton.setPreferredSize(new Dimension(200, 30));
        simbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Main.setVisible(false);
                MainWindow.add(sim);
                sim.setVisible(true);
            }
        });
        //simbutton.setHorizontalAlignment(SwingConstants.NORTH_WEST);
       // simbutton.setVerticalAlignment(SwingConstants.NORTH_WEST);

        JButton gamebutton = new JButton("Spectrum Game");
        gamebutton.setPreferredSize(new Dimension(200, 30));
        

        gamebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Main.setVisible(false);
                MainWindow.add(g);
                g.setVisible(true);
            }
        });
        // gamebutton.setHorizontalAlignment(SwingConstants.NORTH_EAST);
       // gamebutton.setVerticalAlignment(SwingConstants.NORTH_EAST);
        JLabel gif = new JLabel();
        Icon Agif = new ImageIcon("Agif.gif");
        gif.setHorizontalAlignment(SwingConstants.CENTER);
        gif.setVerticalAlignment(SwingConstants.CENTER);
         gif.setIcon(Agif);
        JButton simB = new JButton("Go Back");
        simB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               
                sim.setVisible(false);
                Main.setVisible(true);
            }
        });
        simtoMain.add(simB);
        JButton gB = new JButton("Go Back");
        gB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                g.setVisible(false);
                Main.setVisible(true);
            }
        });
        Main.add(simbutton, BorderLayout.CENTER);
        Main.add(gif);
        Main.add(gamebutton, BorderLayout.CENTER);
        gtoMain.add(gB);
        

        MainWindow.setVisible(true);
        MainWindow.setBounds(200, 80, 860, 600);
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
