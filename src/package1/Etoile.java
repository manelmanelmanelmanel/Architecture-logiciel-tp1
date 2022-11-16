package package1;
import java.awt.Color;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;


public class Etoile extends FormeCirculaireReguliere {

        public Etoile(int x, int y, int r, float epTrait, Color cTrait, Color cRemp) {
        super(5, x, y, r, epTrait, cTrait, cRemp);
    }

        @Override
    protected Path2D construireContour(Point2D.Float[] tabSommets) {
        Path2D.Float leContour = new Path2D.Float();
        leContour.moveTo(tabSommets[0].getX(), tabSommets[0].getY());
        leContour.lineTo(tabSommets[2].getX(), tabSommets[2].getY());
        leContour.lineTo(tabSommets[4].getX(), tabSommets[4].getY());
        leContour.lineTo(tabSommets[1].getX(), tabSommets[1].getY());
        leContour.lineTo(tabSommets[3].getX(), tabSommets[3].getY());
        leContour.closePath();
        return leContour;
    }

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		
	}

}
