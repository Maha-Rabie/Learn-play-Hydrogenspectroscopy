package hydrogenspectroscopy;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Simulation extends javax.swing.JPanel {
    

    public Simulation() {
        initComponents();
        eVSlider.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simPanel = new Hydrogen();
        controlPanel = new javax.swing.JPanel();
        OrbitValue = new javax.swing.JComboBox<>();
        eVSlider = new javax.swing.JSlider();
        Efainal = new javax.swing.JLabel();
        Penergy = new javax.swing.JLabel();
        emitButton = new javax.swing.JButton();
        eVLabel = new javax.swing.JLabel();
        spectrumLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        simPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout simPanelLayout = new javax.swing.GroupLayout(simPanel);
        simPanel.setLayout(simPanelLayout);
        simPanelLayout.setHorizontalGroup(
            simPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        simPanelLayout.setVerticalGroup(
            simPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));

        OrbitValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3" }));
        OrbitValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrbitValueActionPerformed(evt);
            }
        });

        eVSlider.setBackground(new java.awt.Color(255, 255, 255));
        eVSlider.setMajorTickSpacing(10);
        eVSlider.setMaximum(132);
        eVSlider.setMinimum(102);
        eVSlider.setMinorTickSpacing(2);
        eVSlider.setPaintLabels(true);
        eVSlider.setPaintTicks(true);
        eVSlider.setValue(0);
        eVSlider.setName(""); // NOI18N
        eVSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eVSliderStateChanged(evt);
            }
        });

        Efainal.setText("Electron's final orbit  n=");

        Penergy.setText("Photon Energy (eV)");

        emitButton.setBackground(new java.awt.Color(204, 255, 153));

        emitButton.setText("Emit");
        emitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emitButtonActionPerformed(evt);
            }
        });

        eVLabel.setText("0");

        resetButton.setText("reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Penergy)
                            .addComponent(Efainal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrbitValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                    .addComponent(eVSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addComponent(spectrumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spectrumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OrbitValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Efainal))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlPanelLayout.createSequentialGroup()
                                .addComponent(emitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Penergy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton))
                        .addGap(18, 18, 18)
                        .addComponent(eVSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(simPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        reset();


    }//GEN-LAST:event_resetButtonActionPerformed
public void reset(){
    ((Hydrogen) simPanel).reset();
        this.repaint();
         ((Hydrogen) simPanel).setPfinal(10);
                spectrumLabel.setIcon(null);
                eVSlider.setVisible(false);
                eVLabel.setBackground(Color.WHITE);
                eVLabel.setText("0");
                OrbitValue.setSelectedIndex(0);
}
    private void emitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emitButtonActionPerformed
        switch (n) {
            case 0:
                
                break;
            case 1:
                ((Hydrogen) simPanel).getEfinal(n1x, n1y);
                switch (eV) {
                    case 102:
                        ((Hydrogen) simPanel).setPfinal(n1x);
                        ((Hydrogen) simPanel).setEinitial(n2x, n2y);
                        spectrumLabel.setIcon(s1);
                        break;
                    case 121:
                        ((Hydrogen) simPanel).setPfinal(n1x);
                        ((Hydrogen) simPanel).setEinitial(n3x, n3y);
                        spectrumLabel.setIcon(s1);
                        break;
                    case 128:
                        ((Hydrogen) simPanel).setPfinal(n1x);
                        ((Hydrogen) simPanel).setEinitial(n4x, n4y);
                        spectrumLabel.setIcon(s1);
                        break;
                    case 131:
                        ((Hydrogen) simPanel).setPfinal(n1x);
                        ((Hydrogen) simPanel).setEinitial(n5x, n5y);
                        spectrumLabel.setIcon(s1);
                        break;
                    default:
                        ((Hydrogen) simPanel).setPfinal(800);
                        ((Hydrogen) simPanel).setEinitial(n1x, n1y);
                        spectrumLabel.setIcon(s0);

                }

                break;

            case 2:
                ((Hydrogen) simPanel).getEfinal(n2x, n2y);
                switch (eV) {
                    case 19:
                        ((Hydrogen) simPanel).setPfinal(n2x);
                        ((Hydrogen) simPanel).setEinitial(n3x, n3y);
                        spectrumLabel.setIcon(s2);
                        break;
                    case 26:
                        ((Hydrogen) simPanel).setPfinal(n2x);
                        ((Hydrogen) simPanel).setEinitial(n4x, n4y);
                        spectrumLabel.setIcon(s2);
                        break;
                    case 28:
                        ((Hydrogen) simPanel).setPfinal(n2x);
                        ((Hydrogen) simPanel).setEinitial(n5x, n5y);
                        spectrumLabel.setIcon(s2);
                        break;
                    default:
                        ((Hydrogen) simPanel).setPfinal(800);
                        ((Hydrogen) simPanel).setEinitial(n2x, n2y);
                        spectrumLabel.setIcon(s0);
                }

                break;
            case 3:
                ((Hydrogen) simPanel).getEfinal(n3x, n3y);
                switch (eV) {
                    case 7:
                        ((Hydrogen) simPanel).setPfinal(n3x);
                        ((Hydrogen) simPanel).setEinitial(n4x, n4y);

                        spectrumLabel.setIcon(s3);
                        break;
                    case 10:
                        ((Hydrogen) simPanel).setPfinal(n3x);
                        ((Hydrogen) simPanel).setEinitial(n5x, n5y);
                        spectrumLabel.setIcon(s3);
                        break;
                    default:
                        ((Hydrogen) simPanel).setPfinal(800);
                        ((Hydrogen) simPanel).setEinitial(n3x, n3y);
                        spectrumLabel.setIcon(s0);
                }
                break;
            default:
                ((Hydrogen) simPanel).setPfinal(10);
                spectrumLabel.setIcon(s0);
        }
    }//GEN-LAST:event_emitButtonActionPerformed

    private void eVSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eVSliderStateChanged
        eV = eVSlider.getValue();
        eVLabel.setOpaque(true);
        eVLabel.setText(Double.toString(eV / 10.00));
        switch (n) {
            case 0:

                break;
            case 1:
                if (eV == 102 || eV == 121 || eV == 128 || eV == 131) {
                    eVLabel.setBackground(Color.GREEN);
                } else {
                    eVLabel.setBackground(Color.WHITE);
                }
                break;
            case 2:
                if (eV == 19 || eV == 26 || eV == 28) {
                    eVLabel.setBackground(Color.GREEN);
                } else {
                    eVLabel.setBackground(Color.WHITE);
                }
                break;
            case 3:
                if (eV == 7 || eV == 10) {
                    eVLabel.setBackground(Color.GREEN);
                } else {
                    eVLabel.setBackground(Color.WHITE);
                }
                break;
            default:

        }


    }//GEN-LAST:event_eVSliderStateChanged

    private void OrbitValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrbitValueActionPerformed
        n = OrbitValue.getSelectedIndex();

        switch (n) {

            case 0:
              //resetButton.doClick();
                reset();
                break;
            case 1:
                eVSlider.setMaximum(132);
                eVSlider.setMinimum(102);
                eVSlider.setValue(102);
                eVSlider.setVisible(true);
                h1.put(102, new JLabel("10.2 "));
                h1.put(112, new JLabel("11.2 "));
                h1.put(122, new JLabel("12.2 "));
                h1.put(132, new JLabel("13.2 "));
                eVSlider.setLabelTable(h1);
                ((Hydrogen) simPanel).setEsize(10);
                ((Hydrogen) simPanel).setEfinal(n1x, n1y);
                ((Hydrogen) simPanel).setPinitial(n1y);
                this.repaint();

                break;
            case 2:
                eVSlider.setMaximum(38);
                eVSlider.setMinimum(12);
                eVSlider.setValue(12);
                eVSlider.setVisible(true);
                h2.put(13, new JLabel("1.3 "));
                h2.put(23, new JLabel("2.3 "));
                h2.put(33, new JLabel("3.3 "));
                h2.put(38, new JLabel("3.8 "));
                eVSlider.setLabelTable(h2);
                ((Hydrogen) simPanel).setEsize(10);
                ((Hydrogen) simPanel).setEfinal(n2x, n2y);
                ((Hydrogen) simPanel).setPinitial(n2y);
                this.repaint();

                break;
            case 3:
                eVSlider.setMaximum(12);
                eVSlider.setMinimum(2);
                eVSlider.setValue(2);
                eVSlider.setVisible(true);
                h3.put(2, new JLabel("0.2 "));
                h3.put(12, new JLabel("1.2 "));
                
                eVSlider.setLabelTable(h3);
                ((Hydrogen) simPanel).setEsize(10);
                ((Hydrogen) simPanel).setEfinal(n3x, n3y);
                ((Hydrogen) simPanel).setPinitial(n3y);
                this.repaint();

                break;

        }
    }//GEN-LAST:event_OrbitValueActionPerformed
    Icon s0 = new ImageIcon("NoSeries.jpg");
    Icon s1 = new ImageIcon("Lyman.jpg");
    Icon s2 = new ImageIcon("Balmer.jpg");
    Icon s3 = new ImageIcon("Paschen.jpg");
    int eV, n, n2=20,n3=55,n4=90,n5=126;
    int n1x = 525, n1y = 185, n2x = n1x-n2, n2y =n1y-n2, n3x = n1x-n3, n3y = n1y-n3, n4x = n1x-n4, n4y = n1y-n4, n5x = n1x-n5, n5y = n1y-n5;//electron's postion in the graph

    Hashtable h1 = new Hashtable();
    Hashtable h2 = new Hashtable();
    Hashtable h3 = new Hashtable();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Efainal;
    private javax.swing.JComboBox<String> OrbitValue;
    private javax.swing.JLabel Penergy;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel eVLabel;
    private javax.swing.JSlider eVSlider;
    private javax.swing.JButton emitButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel simPanel;
    private javax.swing.JLabel spectrumLabel;
    // End of variables declaration//GEN-END:variables
}
