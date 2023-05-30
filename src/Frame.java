

	import java.awt.Color;
	import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.Timer;

	public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
		int score=0;
		boolean miss = false;
		Background b = new Background();
		Rectangle r = new Rectangle(50,50,50,50);
		Circle c = new Circle((int)(Math.random()*401) + 100, -100);
		Circle c2 = new Circle((int)(Math.random()*401) + 100,-100);
		Circle c3= new Circle((int)(Math.random()*401) + 100, -100);
		hoop h = new hoop();
		Score s = new Score();
		int lives =3;
		lives l = new lives(100,500);
		lives l2 = new lives(150,500);
		lives l3 = new lives(200,500);
		public void paint(Graphics g) {
			super.paintComponent(g);
			b.paint(g);
			c.paint(g);
			s.paint(g);
			h.paint(g);
			l.paint(g);
			l2.paint(g);
			l3.paint(g);
			Font myFont = new Font ("Courier New", 1, 50);
			Color White = new Color(255, 16, 240);
			Graphics2D g2 =(Graphics2D)g;
			g2.setColor(White);
			g2.setFont(myFont);
			g2.drawString((score/2) + " ", 425, 160);
			g2.drawString("Player Score",275, 85);
			if(c.getY()<400) {
				miss = false; 
			}
			if(c.getY()>400 && c.getY()<500 ) {
				if(Rectangle.intersects(h.getRect(), c.getRect())) {
					if(miss == false) {
						score++;
					}
					
			//System.out.println(score);
			}else {
				if(miss == false) {
					miss=true;
					lives --;
					System.out.println(lives);

				}
			}
			}
			
			
		}
		
		public static void main(String[] arg) {
			Frame f = new Frame();
		}
		
		public Frame() {
			JFrame f = new JFrame("Ball Collector");
			f.setSize(new Dimension(900, 600));
			f.setBackground(Color.blue);
			f.add(this);
			f.setResizable(false);
			f.setLayout(new GridLayout(1,2));
			f.addMouseListener(this);
			f.addKeyListener(this);
			Timer t = new Timer(16, this);
			t.start();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
		}
		
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
	
	System.out.println(1);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			repaint();
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
			h.keyPressed(arg0);
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}


}
