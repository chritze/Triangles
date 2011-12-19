import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

import javax.accessibility.AccessibleContext;


public class Triangle {
	Point a;
	Point b;
	Point c;
	int step;
	
	public Triangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		a = new Point(x1, y1);
		b = new Point(x2, y2);
		c = new Point(x3, y3);
		step = 0;
		
		//draw main triangle
		drawTriangle(g, a, b, c);
		
		
		drawSierpinski(g, a , b , c, step);
	}
	

	public void drawTriangle(Graphics g, Point a, Point b, Point c) {
		int[] xPoints = {a.x, b.x, c.x};
		int[] yPoints = {a.y, b.y, c.y};
		
		Polygon p = new Polygon(xPoints, yPoints, 3);
		g.drawPolygon(p);
	}
	
	public void drawSierpinski(Graphics g, Point a, Point b, Point c, int step) {
		Point an = new Point((a.x + c.x)/2, (a.y + c.y)/2);
		Point bn = new Point((a.x + b.x)/2, (a.y + b.y)/2);
		Point cn = new Point(a.x, c.y);
		
		if(step < 7) {
		//draw the main triangle
		drawTriangle(g, an, bn, cn);
		step++;
		//draw the three belonging triangles
		drawSierpinski(g, a, bn, an, step);
		drawSierpinski(g, an, cn, c, step);
		drawSierpinski(g, bn, b, cn, step);
		}
		
	
	}
	
	
	
}
