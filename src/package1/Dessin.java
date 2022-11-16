package package1;

import java.awt.Graphics;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;


public class Dessin extends JPanel{
	
    private final List<IObjetDessinable > objDessin = new CopyOnWriteArrayList();

   
    public int getLargeur() {
        return getWidth();
    }

    
    public int getHauteur() {
        return getHeight();
    }

 
    public void ajouterObjet(IObjetDessinable t) {

        if (!objDessin.contains(t)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
        	objDessin.add(t);
            // le dessin se réaffiche
            repaint();
            this.pause(10);
        }
    }

   
    public void pause(int duree) {
        try {
            Thread.sleep(duree);
        } catch (InterruptedException e) {
        }
    }

    
  
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
      
        for (IObjetDessinable c : objDessin) {
            c.dessiner(g);
        }
    }

   
    public void animer() {
        
        for (IObjetDessinable c : objDessin) {
        	if(c instanceof IObjetAnimable) {
        		((IObjetAnimable)c).deplacer();  
        	}
        	
        	
            
        }
    }

}
