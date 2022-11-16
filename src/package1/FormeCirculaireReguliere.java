package package1;
import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;




public abstract class FormeCirculaireReguliere extends FormeCirculaire {

    protected Path2D contour;

   
    protected FormeCirculaireReguliere(int nbSommets, int x, int y, int r,
            float epTrait, Color cTrait, Color cRemp) {
       
        super(x, y, r, epTrait, cTrait, cRemp);

       
        float deltaAngle = 360f / nbSommets;
        float angle = -90;
        Point2D.Float[] sommets = new Point2D.Float[nbSommets];
        for (int i = 0; i < nbSommets; i++) {
            sommets[i] = new Point2D.Float((float) Math.cos(Math.toRadians(angle)) * r,
                    (float) Math.sin(Math.toRadians(angle)) * r);
            angle += deltaAngle;
        }
        
        contour = construireContour(sommets);
     
    }

    
    protected abstract Path2D construireContour(Point2D.Float[] tabSommets);
    
    @Override
        public void dessiner(Graphics g) {
       
        Graphics2D g2 = (Graphics2D) g.create();
      
        g2.translate(x, y);

        
        if (couleurTrait != null) {
            g2.setColor(couleurTrait);

        }
        g2.setStroke(new BasicStroke(epaisseurTrait));
        g2.draw(contour);

       
        if (couleurRemplissage != null) {
            g2.setColor(couleurRemplissage);
            g2.fill(contour);
        }
    }
}
