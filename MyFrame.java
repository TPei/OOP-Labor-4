package labor4;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**creates frames that show multiple objects in colums and rows
 * @author Thomas
 * @version 0.4
 * 
 * GeometricObjects are shown
 * @see GeometricObject
 */
public class MyFrame extends JFrame
{	
	MyFrame(int noOfGeometricObjects)
	{
		// creates a Frame that contains 8 rows and 8 columns of randomly picked, colored and sized shapes
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		
		
		// central point to set number of geometric objects
		//int noOfGeometricObjects = noOfItems;
		
		// set GridLayout
		setLayout(generateGrid(noOfGeometricObjects));
		
		GeometricObject[] geometricObjects = new GeometricObject[noOfGeometricObjects];
		
		// create 64 shapes
		for(int i = 0; i < noOfGeometricObjects; i++)
		{
			// pick a shape [Triangle, Square, Circle, Pacman, MySpecialShape]
			int shape = (int)Math.round(Math.random()*6);
			
			// pick a relative size
			double size = Math.random();
			
			
			// pick a color
			Color color = randomColor();
			
			// translate randomly picked number to a shape, create and add it
			switch(shape)
			{
			case 0:
				geometricObjects[i] = new MySpecialShape();
				break;
			case 1:
				geometricObjects[i] = new Circle();
				break;
			case 2:
				geometricObjects[i] = new Square();
				break;
			case 3:
				geometricObjects[i] = new Pacman();
				break;
			case 4:
				geometricObjects[i] = new Triangle();
				break;
			case 5:
				geometricObjects[i] = new Smiley();
				break;
			default: // case 6:
				geometricObjects[i] = new AdvancedSmiley();
			}
			
			geometricObjects[i].setRelativeSize(size);
			geometricObjects[i].setColor(color);
			add(geometricObjects[i]);
			validate();
		}
		
		
		setVisible(true);
		
	}
	
	// generate a random rgb color
	public Color randomColor(){
		// pick colors
		int r = (int)Math.round(Math.random()*255);
		int g = (int)Math.round(Math.random()*255);
		int b = (int)Math.round(Math.random()*255);
		
		return new Color(r, g, b);
	}
	
	
	// calculates best (most even) GridLayout and returns it
	public GridLayout generateGrid(int items)
	{
		// calculate rows and cols for grid layout
		int rows = (int)Math.round(Math.sqrt(items));
		int cols = rows;
		
		// if the items number isn't evenly 'squarerootable' we will miss one row/colum
		if (rows * cols < items)
		{
			cols++;
		}
		
		// generate and return GridLayout
		return new GridLayout(rows, cols);
	}
}
