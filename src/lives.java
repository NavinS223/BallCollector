import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class lives {
private int x =  100;
private int y = 100;
private Image img;
private AffineTransform tx;
public lives(int x2, int y2) {
	x = x2;
	y = y2;
	img=getImage("pixil-frame-0 (14).png");
	tx= AffineTransform.getTranslateInstance(x, y);
	
}
public void paint(Graphics g) {// this is the part where we havw to pain our graohics 
	Graphics2D g2 =(Graphics2D)g;
	
	g2.drawImage(img,tx,null);//draw image ofg ther basketball 
	
// this is the y velocity needed for accelartaion 
	// upodatre the velocity 
	init(x, y);
	
	
	
}
public Image getImage(String path) {// thi;s is to paint trhe image as well; we get the image here 
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
		tx.scale(1, 1);

}
}
}
