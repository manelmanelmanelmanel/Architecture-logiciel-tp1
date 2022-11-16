package package1;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Forme implements IObjetDessinable {

    
    protected int x, y;

    protected float epaisseurTrait = 1.0f;

   
    protected Color couleurTrait = null;

   
    protected Color couleurRemplissage;

    
    protected Forme(int x, int y, float epaisseurTrait,
            Color couleurTrait,
            Color couleurRemplissage) {
        this.x = x;
        this.y = y;
        this.couleurRemplissage = couleurRemplissage;
        this.couleurTrait = couleurTrait;
        this.epaisseurTrait = epaisseurTrait;
    }

    
    public int getX() {
        return x;
    }

    
    public int getY() {
        return y;
    }

   
    public void placerA(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void dessiner(Graphics g);
    
      
    
    

}
