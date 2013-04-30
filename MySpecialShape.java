package labor4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MySpecialShape extends GeometricObject 
{
	MySpecialShape()
	{
		
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		//super.paint(g);
		
		// int width and height of window		
		int size = Math.min(ySize, xSize);
		
		// 4-pointed shape
		int nPoints = 4;
		
		// coords
		int[] xPoints = new int[4];
		xPoints[0] = xStart;
		xPoints[1] = xStart;
		xPoints[2] = xStart + size;
		xPoints[3] = xStart + size/2;
		int[] yPoints = new int[4];
		yPoints[0] = yStart+size;
		yPoints[1] = yStart;
		yPoints[2] = yStart;
		yPoints[3] = yStart+size;
		
		//System.out.println(width);
		//System.out.println(height);
		
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
}
