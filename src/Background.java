import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Background {
	private Image img;
	private AffineTransform tx;

	
	
	
	public Background() {
		img = getImage("pixil-frame-0 (16).png");
		tx=AffineTransform.getTranslateInstance(0, 0);
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 =(Graphics2D)g;
		g2.drawImage(img,tx,null);
		init (0,0);
	}
	public Image getImage(String path) {// this is to paint trhe image as well; we get the image here 
		Image tempImage = null;
		try {
			URL imageURL = Circle.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
private void init(double a, double b){//initiLIZES EVERYUTHING 
	tx.setToTranslation(a, b);{
		tx.scale(1.3, 1.6);
		
}

}
}
