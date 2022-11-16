package package1;

public class MvtCirculaire implements IFormeAnimable {

   
    private final int rayon;
    
  
    private final int xc;
    
   
    private final int yc;
    
    private double angle;
    
    private final double deltaAngle;

    public MvtCirculaire(int xc, int yc, int r, double angle, double deltaAngle) {
        this.deltaAngle = deltaAngle;
        this.angle = angle;
        this.rayon = r;
        this.xc = xc;
        this.yc = yc;
    }

    @Override
    public void deplacer(Forme f) {
        angle += deltaAngle;
        double angleRadians = Math.toRadians(angle);
        f.placerA((int) (xc + rayon * Math.cos(angleRadians)),
                (int) (yc + rayon * Math.sin(angleRadians)));
    }

}
