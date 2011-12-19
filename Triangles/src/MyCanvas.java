import java.awt.Canvas;
import java.awt.Graphics;


public class MyCanvas extends Canvas {

	public void paint(Graphics g) {
		Triangle t = new Triangle(g, getWidth()/2, 0, getWidth(), getHeight(), 0, getHeight());
	}
	
}
