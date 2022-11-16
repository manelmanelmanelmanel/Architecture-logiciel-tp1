package package1;

import java.awt.Graphics;

public class Cercle {

	    public final static int R = 5;


    protected int x;

   
    protected int y;

    
    protected int r;

    public Cercle(int xInit, int yInit, int rInit) {
        this.x = xInit;
        this.y = yInit;
        this.r = rInit;
    }

    public Cercle(int xInit, int yInit) {
        this(xInit, yInit, R);
    }

 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public void placerA(int px, int py) {
        x = px;
        y = py;
    }

    
    public void dessiner(Graphics g) {
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
    }
	
	
	
}
