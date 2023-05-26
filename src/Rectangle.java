
public class Rectangle {

		private int x;
		private int y;
		private int width;
		private int height;

		public Rectangle(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			}
		static boolean intersects(Rectangle rect1, Rectangle rect2) {
		
			return rect1.getX() < rect2.getX() + rect2.getWidth() &&
		     rect1.getX() + rect1.getWidth() > rect2.getX() &&
		     rect1.getY() < rect2.getY() + rect2.getHeight() &&
			 rect1.getY() + rect1.getHeight() > rect2.getY();
				}

			public int getX() {
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

			public int getWidth() {
				return width;
			}
			public void setWidth(int initwidth) {
				width=initwidth;
			}

			public int getHeight() {
				return height;
			}
			
		
			
			public void setHeight( int initheight) {
				height=initheight;
			}
}
