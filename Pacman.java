package labor4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Pacman extends GeometricObject
{
	Pacman()
	{
		
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{	
		// starts 30¡ rotated to the left and end 30¡ to the right
		g.fillArc(xStart, yStart, xSize, ySize, 30, 300);
	}	
}