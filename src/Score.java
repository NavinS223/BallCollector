import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.AffineTransform;

public class Score {
	private AffineTransform tx;
	private int score;
	private int x=400;
	private int y=400;
	Circle c = new Circle((int)(Math.random()*401) + 100, -100);
	hoop h = new hoop();
	
	public Score(){
		tx = AffineTransform.getTranslateInstance(0, 0);
		init(0,0);
		score =0;
	
		
		
	}
	
	private void init(double i, double j) {
		tx.setToTranslation(i, j);// TODO Auto-generated method stub
		tx.scale(6, 6);
	}

public void paint(Graphics g) {
	Graphics2D g2 =(Graphics2D)g;
	

	if(Rectangle.intersects(h.getRect(), c.getRect())) {
		
	}


	}
}

