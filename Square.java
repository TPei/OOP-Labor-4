package labor4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Square extends GeometricObject //implements MouseListener, MouseMotionListener
{
	// Square shapes
	Square()
	{
		//addMouseMotionListener(this);
		//addMouseListener(this);
	}	
	
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		// set color and draw/fill shape
		g.fillRect(xStart, yStart, xSize, ySize);
	}

}
