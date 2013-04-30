package labor4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Smiley extends Circle 
{
	// could either extend GeometricObject and setColor and draw oval and smiley parts (mouth and eyes)
	// or extend Circle and call super.specialPaint(...) and draw smiley parts (mouth and eyes)
	Smiley()
	{
		
	}
	
	private int mood = 0;
	
	public int getMood()
	{
		return mood;
	}
	
	public void incrementMood()
	{
		// feeling should always be in [0, 1, 2]
		mood = ++mood%3;
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		super.specialPaint(g, xSize, ySize, xStart, yStart);
		/*
		// set color and draw/fill shape
		g.setColor(this.getColor());
		g.fillOval(xStart, yStart, xSize, ySize);
		*/
		
		// draw eyes, mouth
		g.setColor(new Color(255, 255, 255));
		g.fillArc(xStart+xSize/3, yStart+ySize/3, xSize/5, ySize/5, 0, 360);
		g.fillArc(xStart+xSize*2/3, yStart+ySize/3, xSize/5, ySize/5, 0, 360);
		
		//int feeling = (int)Math.round(Math.random()*2);
		int feeling = getMood();
		
		switch(feeling)
		{
		case 0:
			// happy
			g.fillArc(xStart+xSize/4, yStart+ySize*2/4, xSize/2, ySize/3, 180, 180);
			break;
		case 1:
			// neutral
			g.drawLine(xStart+xSize/4, yStart+ySize*2/3, xStart+xSize*3/4, yStart+ySize*2/3);
			break;
		case 2:
			//unhappy
			g.fillArc(xStart+xSize/4, yStart+ySize*2/3, xSize/2, ySize/4, 0, 180);
			break;
		}
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		/* 
		 * changes feeling, then
		 * simply repaints, causing a change in
		 * smiley 'feeling'
		 */
		incrementMood();
		repaint();	
	}
}