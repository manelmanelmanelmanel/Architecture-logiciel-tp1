package package1;

import java.awt.Graphics;

public class CercleDebut extends Cercle{
	 
    protected double pointe;

   
    public CercleDebut(int xInit, int yInit, int rInit, double cInit) {
        super(xInit, yInit, rInit);
        pointe = cInit;
    }

    
    public CercleDebut(int xInit, int yInit) {
        this(xInit, yInit, R, 0.0);
    }

   
    @Override
    public void dessiner(Graphics g) {
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }

    private double normalize(double d) {
        double res = Math.abs(d) % 360;
        if (d < 0) {
            if (res > 180) {
                res = 360 - res;
            } else {
                res = -res;
            }
        } else {
            if (res > 180) {
                res = -(360 - res);
            }
        }
        return res;
    }

       public void devierPointe(double deltaC) {
        pointe += deltaC;
        pointe = normalize(pointe);
    }

   
    public void deplacerSelonPointe() {
        x = (int) (x + r * Math.cos(Math.PI * pointe / 180));
        y = (int) (y + r * Math.sin(Math.PI * pointe / 180));
    }

   
    public boolean pointeOK(int xMax, int yMax) {
        int x1 = (int) (x + r * Math.cos(Math.PI * pointe / 180));
        int y1 = (int) (y + r * Math.sin(Math.PI * pointe / 180));

        return x1 >= r && x1 <= (xMax - r) && y1 >= r & y1 <= (yMax - r);
    }
}
