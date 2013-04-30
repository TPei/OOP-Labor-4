package labor4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/** abstract superclass for all geometric objects
 * @author Thomas
 * @version 0.4
 */
abstract public class GeometricObject extends JPanel implements MouseListener, MouseMotionListener
{
	GeometricObject()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	/**
	 *  relativeSize of an object is accessed by the paint methods
	 */
	private double relativeSize = Math.max(Math.random(), 0.2);
	
	/**
	 * color of an object is accessed by the paint methods
	 */
	private Color objectColor = randomColor();
	
	/**
	 * feeling should be in [0, 1, 2]
	 * is used when objects of Smiley or AdvancedSmiley are drawn
	 * 
	 * @see Smiley
	 * @see AdvancedSmiley
	 */
	
	
	
	// enables the object to get the size
	public double getRelativeSize()
	{
		return relativeSize;
	}
	
	// enables the objects to get the color
	public Color getColor(){
		return objectColor;
	}
	
	public Color randomColor(){
		// pick colors
		int r = (int)Math.round(Math.random()*255);
		int g = (int)Math.round(Math.random()*255);
		int b = (int)Math.round(Math.random()*255);
		
		return new Color(r, g, b);
	}
	
	abstract protected void specialPaint(Graphics g, int xSize, int ySize, int xStart, int yStart);
		
	public void paint(Graphics g)
	{
		super.paint(g);
		
		// int width and height of window
		int width = getWidth(); 
		int height = getHeight();
		
		//width = Math.min(width, height);
		//height = width;
		
		// gets the space that is available
		int minSpace = Math.min(width, height);
		int side = (int)Math.round(minSpace * this.getRelativeSize());
		
		// set white background
		g.setColor(new Color(255, 255, 255));
		g.fillRect(0, 0, width, height);
		
		// set red border
		g.setColor(new Color(255, 0, 0));
		g.drawRect(0, 0, width-1, height-1); // -1 so that the border is inside
		
		
		
		// calculates the space that is left
		int restHeight = (height - side)/2;
		int restWidth = (width - side)/2;
		
		g.setColor(this.getColor());
		
		// calls specialPaint
		specialPaint(g, side, side, restWidth, restHeight);
	}
	
	// sets color
	public void setColor(Color color)
	{
		this.objectColor = color;
	}
	
	// sets relative size
	public void setRelativeSize(double relativeSize)
	{
		this.relativeSize = Math.max(0.2, relativeSize);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// sets a random size and repaints
		setRelativeSize(Math.random());
		
		repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// sets a random color and repaints
		setColor(randomColor());
		repaint();
	}
	
}
