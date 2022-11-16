package package1;

import java.awt.Color;
import java.awt.Graphics;


public abstract class FormeCirculaire extends Forme {

   
    protected int rayon;

    
    public FormeCirculaire(int x, int y, int rayon, float epaisseurTrait, 
            Color couleurTrait, Color couleurRemplissage) {
        super(x, y, epaisseurTrait, couleurTrait, couleurRemplissage);
        this.rayon = rayon;
    }
    public abstract void dessiner();

    
}
