package package1;

import java.awt.Color;
import java.awt.Graphics;



public class TrainCercleCouleur extends TrainCercle {
	
    private final Color coul;

    
    public TrainCercleCouleur(Color coul, Dessin d, int r, int nbCercle) {
        super(d, r, nbCercle);
        this.coul = coul;
    }

    @Override
    public void dessiner(Graphics g) {
        Graphics gd = g.create();   // fait une copie du contexte graphique
        gd.setColor(coul);   // pour que le changement de couleur n'affecte que
        // ce train cercle
        super.dessiner(gd);
    }
}
