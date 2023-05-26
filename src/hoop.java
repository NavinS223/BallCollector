import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class hoop {
	private Image img1;
	private AffineTransform tx;
	private int x= 400;//random x posiution for the ball to fall from the sky 
	private int y = 400;
	private Rectangle r;
	
public hoop() {
	 img1 = getImage("pixil-frame-0 (15).png");// get the image 
	tx = AffineTransform.getTranslateInstance(0, 0);
	init(0,0);
	r = new Rectangle(x, y, 100, 100);
}

private void init(double i, double j) {
	tx.setToTranslation(i, j);// TODO Auto-generated method stub
	tx.scale(.5, .5);

	r = new Rectangle(x, y, 100, 100);
}

private Object getImage1(String string) {
	// TODO Auto-generated method stub
	return null;
}
public void paint(Graphics g) {// this is the part where we havw to pain our graohics 
	Graphics2D g2 =(Graphics2D)g;
	g2.drawImage(img1,tx,null);
	init(x,y);
	g.drawRect(x, y, 50, 50);

	//draw image off ther basketball 
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

public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getKeyCode() == KeyEvent.VK_A) {
		x = x - 50;
	} else if (arg0.getKeyCode() == KeyEvent.VK_D) {
		x = x + 50;
	}
	
	init(x, y);
}

public Rectangle getRect() {
	return r;
}

}
