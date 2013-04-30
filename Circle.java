package labor4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Circle extends GeometricObject
{
	Circle()
	{
		
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		// set color and draw/fill shape
		g.setColor(this.getColor());
		g.fillOval(xStart, yStart, xSize, ySize);
	}
}
