package hydrogenspectroscopy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Hydrogen extends JPanel implements ActionListener {

    int rade, xe, ye, fxe, fye, vxe = 1, vye = 1;//electron parameters
    int xp, yp, fxp, radp, vxp = 1;//photon parameters
    int fxe0, fye0, i = 0;

    Timer tm = new Timer(4, this);

    Hydrogen() {
        reset();
    }

    public void reset() {
        //initial values
        fxe0 = 525;
        fye0 = 185;
        xe = 525;
        ye = 185;
        fxe = 525;
        fye = 185;
        xp = 10;
        yp = 165;
        fxp = 10;
        radp = 10;
        rade = 0;
        i = 0;
    }

    public void setEinitial(int xe, int ye) {
        this.xe = xe;
        this.ye = ye;
    }

    public void setEfinal(int fxe, int fye) {
        this.fxe = fxe;
        this.fye = fye;
    }

    public void setEsize(int rade) {
        this.rade = rade;
    }

    public void setPinitial(int yp) {
        this.yp = yp;
    }

    public void setPfinal(int fxp) {
        this.fxp = fxp;
    }

    public void getEfinal(int fxe0, int fye0) {
        this.fxe0 = fxe0;
        this.fye0 = fye0;
    }

    public void paint(Graphics g) {
        tm.start();
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(540, 190, 20, 20);//nuclus
        g.drawArc(525, 180, 50, 50, 0, 180);//n1
        g.drawArc(500, 150, 100, 100, 0, 180);//n2
        g.drawArc(450, 100, 200, 200, 0, 180);//n3
        g.drawArc(400, 50, 300, 300, 0, 180);//n4
        g.drawArc(350, 0, 400, 400, 0, 180);//n5
        g.setColor(Color.YELLOW);
        g.fillOval(xp, yp, radp, radp);//photon
        g.setColor(Color.DARK_GRAY);
        g.fillRect(10, 100, 30, 120);//emitter
        g.setColor(Color.GRAY);
        g.fillRect(40, 120, 15, 80);//emitter tip
        g.setColor(Color.BLUE);
        g.fillOval(fxe, fye, rade, rade);//electron 
    }

    public void actionPerformed(ActionEvent e) {
        //photon motion
        if (xp < fxp - radp) {
            xp += vxp;
        }
        if (xp == fxp - radp) {
            radp = 0;
            //electrm changing postion to intial n
            if (fye != ye && i == 0) {
                fye -= vye;
            }
            if (fxe != xe && i == 0) {

                fxe -= vxe;
            } else {
                //electrm changing postion to final n
                i = 1;
                if (fxe != fxe0) {
                    fxe += vxe;
                }
                if (fye != fye0) {
                    fye += vye;
                }
            }
        }

        repaint();
    }

}
