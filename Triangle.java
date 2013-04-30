package labor4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Triangle extends GeometricObject
{
	Triangle()
	{
		
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		//super.paint(g);
		
		// int width and height of window		
		int minSpace = Math.min(xSize, ySize);
		
		int size = (int) Math.round(minSpace);
		
		// 3-pointed shape
		int nPoints = 3;
		
		// coords
		int[] xPoints = new int[3];
		xPoints[0] = xStart;
		xPoints[1] = xStart + size/2;
		xPoints[2] = xStart + size;
		int[] yPoints = new int[3];
		yPoints[0] = yStart+size;
		yPoints[1] = yStart;
		yPoints[2] = yStart+size;
		
		
		//System.out.println(width);
		//System.out.println(height);
		
		g.fillPolygon(xPoints, yPoints, nPoints);
	}

	
	
}
