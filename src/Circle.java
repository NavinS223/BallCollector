//here we import everything
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Circle {// this is the ball clas yjay we named circle and in this we establish our instance variavles
	private int x= (int)(Math.random()*401) + 100;//random x posiution for the ball to fall from the sky 
	private int y = -100;// this is the y position for the ba;l
	private int vy = 20;// this is the velocity of thre ball
	private Image img;// here we declare and instantionaliuze the image for us to import 
	private AffineTransform tx;
	private Rectangle r;
	
	public Circle(int x2, int y2) {// this is the ball constructor in which we aim to get the image of the basketball that we drew 
		x=x2;
		y=y2;
		img = getImage("Basketball-EDITED.png");// get the image 
		
		tx = AffineTransform.getTranslateInstance(x, y);
		init (0,0);
		r = new Rectangle(x, y, 100, 100);
		
	}
	
	
	public void paint(Graphics g) {// this is the part where we havw to pain our graohics 
		Graphics2D g2 =(Graphics2D)g;
		g2.drawImage(img,tx,null);//draw image ofg ther basketball 
		
		y+=vy;// this is the y velocity needed for accelartaion 
		// upodatre the velocity 
		init(x, y);
		
		if(y==800) {
			y=-100;
			x=(int)(Math.random()*801);
			r = new Rectangle(x, y, 50, 50);
		}
		g.drawRect(x,y,50,50);
		
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
		tx.scale(.5, .5);
		r = new Rectangle(x, y, 100, 100);
}
	
}public int getX() {
	return x;
}
public void setX(int initx) {
	x=initx;
}
public int getY() {
	return y;
}
public void setY(int inity) {
	y=inity;
}

public Rectangle getRect() {
	return r;
}



}
