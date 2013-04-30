package labor4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class AdvancedSmiley extends Smiley
{
	AdvancedSmiley()
	{
		
	}
	
	@Override
	public void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart)
	{
		Image happy = Toolkit.getDefaultToolkit().getImage("/Users/Thomas/Dropbox/Programming/OOP/Labore/src/labor4/pictures/happy.png");
		Image neutral = Toolkit.getDefaultToolkit().getImage("/Users/Thomas/Dropbox/Programming/OOP/Labore/src/labor4/pictures/neutral.png");
		Image sad = Toolkit.getDefaultToolkit().getImage("/Users/Thomas/Dropbox/Programming/OOP/Labore/src/labor4/pictures/sad.jpeg");
		
		//int feeling = (int)Math.round(Math.random()*2);
		
		int mood = getMood();
		
		switch(mood)
		{
		case 0:
			// happy
			g.drawImage(happy, xStart, yStart, xSize, ySize, this);
			break;
		case 1:
			// neutral
			g.drawImage(neutral, xStart, yStart, xSize, ySize, this);
			break;
		case 2:
			//unhappy
			g.drawImage(sad, xStart, yStart, xSize, ySize, this);
			break;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
