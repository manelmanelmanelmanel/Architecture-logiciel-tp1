package package1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class CercleDebutImage extends CercleDebut {

	
    private final BufferedImage img;
    
   
    public CercleDebutImage(int xInit, int yInit, int cap, BufferedImage img) {
        super(xInit, yInit, img.getWidth() /2 , cap);
        this.img = img;
    }

  
    @Override
    public void dessiner(Graphics g) {
        g.drawImage(img, 
                this.x - r, this.y - r, this.x + r, this.y + r,
                0, 0, 63, 63, null);
    }
	
}
