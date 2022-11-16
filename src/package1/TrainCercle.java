package package1;

import java.awt.Graphics;

public class TrainCercle implements IObjetAnimable {

	 //------- variables d'instance (attributs) --------------------------
   
    private final Cercle[] lesCercles;
    
    protected CercleDebut leDebut;
    
    private Dessin dess;

   
  
    public TrainCercle(Dessin d, int r, int nbCercle) {
        this(d, new CercleDebut(d.getLargeur() / 2, d.getHauteur() / 2, r, 0.0), r, nbCercle);
    }

   
    protected TrainCercle(Dessin d, CercleDebut deb, int r, int nbCercle) {

    	 this.dess = d;
         // crée un cercle de d�but au centre de la fenêtre et de pointe 0
         this.leDebut = deb;
         int xTete = leDebut.getX();
         int yTete = leDebut.getY();

        // 1) créer le tableau
        lesCercles = new Cercle[nbCercle];
        // 2) remplir le tableau en cr�eant les cercles et en stockant
        //    leur r�f�rence dans les �l�ments du tableau.
        // cr�er les cercles, à gauche les uns des autres. Le premier
        // (Cercle n° 0) étant à gauche du d�but
        for (int i = 0; i < lesCercles.length; i++) {
            lesCercles[i] = new Cercle(xTete - (i + 1) * r, yTete, r);
        }
    }

    
 
    public void dessiner(Graphics g) {
        // dessiner la tête
    	leDebut.dessiner(g);
        for (Cercle c : lesCercles) {
            c.dessiner(g);
        }
    }

    
   
    public void deplacer() {
        if (lesCercles.length > 0) {
            
            for (int i = lesCercles.length - 1; i > 0; i--) {
                lesCercles[i].placerA(lesCercles[i - 1].getX(), lesCercles[i - 1].getY());
            }
            lesCercles[0].placerA(leDebut.getX(), leDebut.getY());
        }

       
        leDebut.devierPointe(-30.0 + Math.random() * 60.0);
        while (!leDebut.pointeOK(dess.getLargeur(), dess.getHauteur())) {
        	leDebut.devierPointe(10);
        }
       
        leDebut.deplacerSelonPointe();
    }

}
	
	
	

