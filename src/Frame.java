

	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Graphics;
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
		Background b = new Background();
		Circle c = new Circle((int)(Math.random()*401) + 100, -100);
		Circle c2 = new Circle((int)(Math.random()*401) + 100,-100);
		Circle c3= new Circle((int)(Math.random()*401) + 100, -100);
		hoop h = new hoop();
		Score s = new Score();
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
			if(Rectangle.intersects(h.getRect(), c.getRect())) {
				score++;
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
