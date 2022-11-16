package package1;
import java.awt.Color;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class PolygoneRegulier extends FormeCirculaireReguliere {

  
    public PolygoneRegulier(int nbSommets, int x, int y, int r,
            float epTrait, Color cTrait, Color cRemp) {
        super(nbSommets, x, y, r, epTrait, cTrait, cRemp);
    }

   
    @Override
    protected Path2D construireContour(Point2D.Float[] tabSommets) {

       
        Path2D leContour = new Path2D.Float();

        leContour.moveTo(tabSommets[0].getX(), tabSommets[0].getY());
        for (int i = 1; i < tabSommets.length; i++) {
            leContour.lineTo(tabSommets[i].getX(), tabSommets[i].getY());
        }
        leContour.closePath();
        return leContour;
    }

	@Override
	public void dessiner() {
	
	}

}
